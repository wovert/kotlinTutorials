package net.wovert.java.file;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

public class DemoFileFilter {
    public static void main(String[] args) {
        File f = new File("./");
        getAllFile(f);
    }

    public static void getAllFile(File dir) {
        System.out.println(dir);
//        File[] files = dir.listFiles(new FileFilterImp()); // 传递过滤器对象
//        File[] files = dir.listFiles(new FileFilter() {
//
//            @Override
//            public boolean accept(File pathname) {
//                if (pathname.isDirectory()) {
//                    return true;
//                }
//                return pathname.getName().toLowerCase().endsWith(".java");
//            }
//        }); // 传递匿名内部类过滤器对象
        File[] files = dir.listFiles(pathname-> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));

        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
         }
    }
}

class FileFilterImp implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
