import java.io.*;

public class DemoCharset {
    public static void main(String[] args) throws IOException {
//        show1();
        show2();
//        show3();
    }

    private static void show2() throws IOException {
        OutputStreamWriter ows = new OutputStreamWriter(new FileOutputStream("./GBK_file"), "GBK");
        ows.write("中国");
        ows.flush();
        ows.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("./GBK_file"), "GBK");
        int len = 0;
        while((len = isr.read()) != -1) {
            System.out.print((char)len);
        }
        isr.close();
    }

    private static void show3() throws IOException {
       // 创建InputStreamReader对象，构造方法中传递字节输入流和指定编码表名称 GBK
       InputStreamReader isr = new InputStreamReader(new FileInputStream("./GBK_file.txt"), "GBK");
       // 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
       OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./UTF8_file.txt"), "UTF-8");

       int len = 0;
       while((len = isr.read()) != -1) {
            osw.write(len);
       }
       osw.close();
       isr.close();
    }

    private static void show1() throws IOException {
        FileReader fr = new FileReader("./GBK_file.txt");
        int len = 0;
        while((len = fr.read()) != -1) {
            System.out.print((char)len);
        }
        fr.close();
    }
}
