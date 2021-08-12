import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DemoCharStream {
    public static void main(String[] args) throws IOException {
//        read1();
//        read2();
//        write1();
        write2();
    }
    public static void read1() throws IOException {
        // 1. Create FileReader
        FileReader fr = new FileReader("./tmp1");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }
        fr.close();
    }
    public static void read2() throws IOException {
        // 1. Create FileReader
        FileReader fr = new FileReader("./tmp1");
        int len = 0; // 每次读取的有效字符个数
        char[] ch = new char[1024]; // 存储读取到多个字符
        while ((len = fr.read(ch)) != -1) {
            System.out.println(new String(ch, 0, len));
        }
        fr.close();
    }
    public static void write1() throws IOException {
        FileWriter fw = new FileWriter("./writer.txt");
        // 把数据写入到内存缓冲区中（字符转换为字节的过程）
        fw.write(97);
        fw.flush(); // 把内存缓冲区的数据，刷新到文件中
        fw.close();
    }
    public static void write2() throws IOException {
        FileWriter fw = new FileWriter("./writer.txt");
        // 把数据写入到内存缓冲区中（字符转换为字节的过程）
//        char[] cs = {'a', 'b', 'c'};
//        fw.write(cs);
//        fw.write(cs, 2,1);
//        fw.write("Hello World");
        fw.write("Hello World", 2, 3);
        fw.close();
    }
}
