import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./tmp1");
        int len;
        byte[] bytes = new byte[2]; // 一次读取2个字节，len读取有效字节个数， 1024=1KB，或 1024倍数
//        fis.read() // 读取一个字节
        while((len = fis.read(bytes)) != -1) {
//            System.out.println(len);
//            System.out.println(Arrays.toString(bytes)); // [97, 98]
//            System.out.println(new String(bytes)); // ab
            System.out.println(new String(bytes, 0, len)); // ab
        }
        fis.close();
    }
}
