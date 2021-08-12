import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./tmp1");
        FileOutputStream fos = new FileOutputStream("./output.txt");
        int len;
        byte[] bytes = new byte[1024]; // 一次读取2个字节，len读取有效字节个数， 1024=1KB，或 1024倍数
//        fis.read() // 读取一个字节
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0, len);
        }
        fis.close();
        fos.close();
    }
}
