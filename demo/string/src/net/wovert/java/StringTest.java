package net.wovert.java;

import java.io.UnsupportedEncodingException;

public class StringTest {
    public static void main(String ... args) throws UnsupportedEncodingException {
        // 创建 String 对象的方法
        String s1 = "wovet";
        String s2 = new String();
        String s3 = new String("I'm wovert here.");

        System.out.println(s3.length());
        System.out.println(s3.substring(1,3));
        System.out.println(s3.indexOf('o'));
        System.out.println(s3.indexOf('e', 10));
        System.out.println(s3.lastIndexOf('r'));
        System.out.println(s3.charAt(1));

        // 字符串和byte数组之间的相互转换
        String str = new String("Java 中国 Kotlin");
        byte[] arr = str.getBytes();
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }

        // byte数组转换为字符串
        String str4 = new String(arr, "utf-8");
        System.out.println(str4);

        StringBuilder sb = new StringBuilder("你好");
        sb.append(",");
        sb.append("wovert");
        System.out.println("sb=" + sb);
    }
}
