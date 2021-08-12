package net.wovert.java.file;

import java.io.File;
import java.io.IOException;

/**
 * java.io.File
 */

public class DemoFile {
    public static void main(String[] args) throws IOException {
        String pathSeparator = File.pathSeparator; // 路径分隔符 windows: ; Linux: :
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator); // 文件名称分隔符 windows: \, Linux: /

        File f1 = new File("/Users/wovert/Desktop/chat.html");
        System.out.println(f1);
        System.out.println("绝对路径：" + f1.getAbsoluteFile());
        System.out.println("文件路径：" + f1.getPath());
        System.out.println("文件名称：" + f1.getName()); // chat.html
        System.out.println("文件大小：" + f1.length());
        System.out.println("构造方法路径是否存在：" + f1.exists());
        System.out.println("是否为目录：" + f1.isDirectory());
        System.out.println("是否为文件：" + f1.isFile());
        System.out.println("--------------------------------------");

        File f2 = new File("/Users/wovert/Desktop/images");
        System.out.println(f2);
        System.out.println("绝对路径：" + f2.getAbsoluteFile());
        System.out.println("文件路径：" + f2.getPath());
        System.out.println("文件名称：" + f2.getName());
        System.out.println("文件大小：" + f2.length());
        System.out.println("构造方法路径是否存在：" + f2.exists());
        System.out.println("是否为目录：" + f2.isDirectory());
        System.out.println("是否为目录：" + f2.isDirectory());
        System.out.println("是否为文件：" + f2.isFile());
        System.out.println("--------------------------------------");

        File f3 = new File("./DemoFile");
        System.out.println(f3);
        System.out.println("绝对路径：" + f3.getAbsoluteFile());
        System.out.println("文件路径：" + f3.getPath());
        System.out.println("文件名称：" + f3.getName()); // DemoFile.java
        System.out.println("文件大小：" + f3.length());
        System.out.println("构造方法路径是否存在：" + f3.exists());
        System.out.println("是否为目录：" + f3.isDirectory());
        System.out.println("是否为目录：" + f3.isDirectory());
        System.out.println("是否为文件：" + f3.isFile());
        System.out.println("--------------------------------------");

        File f4 = new File("./create.txt");
        boolean b1 = f4.createNewFile();
        System.out.println(b1);
        System.out.println("--------------------------------------");

        File f5 = new File("./create_dir/01/aa");
//        boolean b2 = f5.mkdir();
        boolean b2 = f5.mkdirs();
        System.out.println(b2);
        System.out.println("--------------------------------------");

        File f6 = new File("./create_dir/01/aa");
        boolean b3 = f6.delete();
        System.out.println(b3);
        System.out.println("--------------------------------------");

        File f7 = new File("./");
        String[] arr = f7.list(); // 遍历目录
        for (String fileName: arr) {
            System.out.println(fileName);
        }
        System.out.println("--------------------------------------");

        File f8 = new File("./");
        File[] files = f8.listFiles(); // 遍历目录
        for (File file: files) {
            System.out.println(file);
        }
        System.out.println("--------------------------------------");


    }
}
