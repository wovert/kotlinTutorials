package com.wovert.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator  {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("one");
        coll.add("two");
        coll.add("three");
        coll.add("four");
        coll.add("five");

        // 遍历
        Iterator<String> t = coll.iterator();

        while(t.hasNext()) {
            String s = t.next();
            System.out.println(s);
        }

//        boolean b1 = t.hasNext();
//        System.out.println("b=" + b1);
//        String s1 = t.next();
//        System.out.println("s1=" + s1);
//
//        boolean b2 = t.hasNext();
//        System.out.println("b2=" + b2);
//        String s2 = t.next();
//        System.out.println("s2=" + s2);
//
//        boolean b3 = t.hasNext();
//        System.out.println("b3=" + b3);
//        String s3 = t.next();
//        System.out.println("s3=" + s3);
//
//        boolean b4 = t.hasNext();
//        System.out.println("b4=" + b4);
//        String s4 = t.next();
//        System.out.println("s4=" + s4);
//
//        boolean b5 = t.hasNext();
//        System.out.println("b5=" + b5);
//        String s5 = t.next();
//        System.out.println("s5=" + s5);
//
//        boolean b6 = t.hasNext();
//        System.out.println("b6=" + b6);
//        String s6 = t.next();
//        System.out.println("s6=" + s6);

    }
}
