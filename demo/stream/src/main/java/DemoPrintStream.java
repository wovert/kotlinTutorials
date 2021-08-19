import java.io.*;
import java.sql.SQLOutput;

public class DemoPrintStream {
    public static void main(String[] args) throws IOException {
        System.out.println("在控制台输出内容~");

        PrintStream ps = new PrintStream("./目的地打印流.txt");
        System.setOut(ps);

        System.out.println("我在打印流的目的地输出");

        ps.close();
    }
}
