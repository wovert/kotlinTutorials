import java.io.*;

public class DemoBufferedOutputStream {
    public static void main(String[] args) throws IOException {
//        output1();
//        input1();
//        copy();
//        charOutput();
        charInput();
    }

    private static void charInput() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./2.txt"));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    private static void charOutput() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./2.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("你好");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static void copy() throws IOException {
        long s = System.currentTimeMillis();
        // 创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./tmp1"));

        // 创建字节缓冲区输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./output.txt"));

        // 你用字节缓冲输入流对象中的方法 read, 读取文件
        // 一次读取一个字节吸入一个字节的方法
        int len = 0;
//        while((len = bis.read()) != -1) {
//            bos.write(len);
//        }
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();


        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时：" + (e-s) + "毫秒");
    }

    private static void input1() throws IOException {
        FileInputStream fis = new FileInputStream("./1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
//        while ((len = bis.read()) != -1) {
//            System.out.println(len);
//        }
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        bis.close();
    }

    public static void output1() throws IOException {
        FileOutputStream fos = new FileOutputStream("./1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
