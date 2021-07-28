package com.wovert.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {
    public static void main(String[] args) {
        // create collection，使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); // override toString()

        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1); // true
        System.out.println(coll);
        coll.add("里斯");
        coll.add("王武");
        coll.add("赵六");
        System.out.println(coll);

        boolean r1 = coll.remove("赵2六");
        System.out.println("r1:" + r1); // false
        System.out.println(coll);

        boolean r2 = coll.remove("赵六");
        System.out.println("r2:" + r2); // true
        System.out.println(coll);

        System.out.println("coll.contains(王武):" + coll.contains("王武")); // true
        System.out.println("coll.isEmpty():" + coll.isEmpty()); // false
        System.out.println("coll.size():" + coll.size()); // 3
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.clear();
        System.out.println("coll.contains(王武):" + coll.contains("王武")); // true
        System.out.println(coll);


    }
}
