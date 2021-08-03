package com.wovert.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(6);
        set.add(3);
        set.add(2);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int ele = it.next();
            System.out.println(ele);
        }
        System.out.println("-------");
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
