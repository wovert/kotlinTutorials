package com.wovert.java.collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * java.util.Hashtable<K,V> 集合 implements Map<K, V>接口
 * Hashtable: 底层是哈希表，是一个线程安全的集合，单线程集合，速度慢
 * HashMap: 底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
 *
 * HashMap集合：可以存储null值，null键
 * Hashtable集合：不能存储null值，null键
 *
 * Hashtable和Vector集合一样，在JDK1.2版本之后被更先进的集合（HashMap, ArrayList）取代了
 * Hashtable 的子类 Properties 依然活跃在历史舞台
 * Properties 集合一个唯一和IO流结合的集合
 */
public class DemoHashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null, "a");
//        table.put("b", null);
//        table.put(null, null);
        System.out.println(table);
    }
}
