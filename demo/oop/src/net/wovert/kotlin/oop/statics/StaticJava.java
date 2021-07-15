package net.wovert.kotlin.oop.statics;

public class StaticJava {
    public static void main(String ...args) {
//        Latitude latitude = Latitude.Companion.ofDouble(3.0);
        Latitude latitude = Latitude.ofDouble(3.0); // @JvmStatic 加上之后 kotlin调用方法一样
        System.out.println(Latitude.TAG);
    }
}