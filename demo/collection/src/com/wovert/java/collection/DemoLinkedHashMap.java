package com.wovert.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("b", "b");
        map.put("a", "a");
        map.put("c", "c");
        map.put("a", "d");
        System.out.println(map); // key 不允许重复，无序

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked); // key 不允许重复，有序

    }
}
