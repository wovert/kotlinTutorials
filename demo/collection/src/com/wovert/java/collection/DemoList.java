package com.wovert.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        /**
         * List接口特点
         * 1. 有序的集合
         * 2. 有索引
         * 3. 允许存储重复的元素
         */

        // 创建List集合对象
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        System.out.println(list);

        list.add(2, "d");
        System.out.println(list);

        String removeEle = list.remove(0);
        System.out.println(list);
        System.out.println(removeEle);

        // replace
        String setEle = list.set(0, "B");
        System.out.println(setEle); // 'b'
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("------");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }


    }
}
