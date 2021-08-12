import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        // OutputStream 内存中的数据写入到硬盘中
//        FileOutputStream fos = new FileOutputStream("./tmp1");
        FileOutputStream fos = new FileOutputStream("./tmp1", true); // append
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));

        byte[] bytes = {65, 66, 67, 68};
//        fos.write(bytes);
        fos.write(bytes, 1, 2);
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));

        byte[] bytes2 = "你好".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
