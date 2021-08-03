package com.wovert.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("one", "1");
        System.out.println("v1=" + v1); // 返回 null
        System.out.println(map);

        String v2 = map.put("one", "2");
        System.out.println("v2=" + v2); // 返回 1
        System.out.println(map);

        String v3 = map.put("three", "3");
        System.out.println("v3=" + v3); // 返回 null
        System.out.println("---------");


        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------");

        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------");


        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("---------");


        Set<Map.Entry<String, String>> setEntry = map.entrySet();

        Iterator<Map.Entry<String, String>> it2 = setEntry.iterator();
        while(it2.hasNext()) {
            Map.Entry<String, String> entry = it2.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("---------");

        for(Map.Entry<String, String>  entry:setEntry) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }



    }
}
