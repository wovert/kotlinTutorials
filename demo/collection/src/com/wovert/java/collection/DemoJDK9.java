package com.wovert.java.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JDK9 新特性
 * List, Set, Map 等接口：增加了一个静态的方法 of, 可以给集合一次性添加多个元素
 * static <E> List<E> of (E... elements)
 * 当集合结合中存储的元素的个数已经确定了，不再改变时使用
 * 注意：
 *   1. of 方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
 *   2. of 方法的返回值是一个不能改变的集合，集合不能再使用add, put 方法，会抛出异常
 *   3. Set和Map接口在调用 of 方法的时候，不能有重复的元素，否则会抛出异常
 */
public class DemoJDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c");
        System.out.println(list);
//        list.add("e");  // Exception in thread "main" java.lang.UnsupportedOperationException

//        Set<String> set = Set.of("a", "b", "a", "c"); // Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: a
//        System.out.println(set);

//        Exception in thread "main" java.lang.IllegalArgumentException: duplicate key: 张三
        Map<String, Integer> map = Map.of("张三", 18, "李四", 20, "王五", 39, "张三", 23);
        System.out.println(map);

    }
}
