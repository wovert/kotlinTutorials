package com.wovert.java.collection;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

/**
 * HashMap存储自定义类型键值
 * 保证key是唯一的：作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class DemoHashMap {
    public static void main(String[] args) {
//        show();
        custom();
    }

    /**
     * Key: String类型，重写hashCode方法和equals方法，保证key唯一
     * value: Person 类型，可以重复（同名同年龄的人）
     */
    private static void show() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李三", 28));
        map.put("广州", new Person("王五", 38));
        map.put("上海", new Person("张三", 18));

        // keySet加增强 for 遍历 map集合
        Set<String> set = map.keySet();
        for(String key: set) {
            Person value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }

    private static void custom() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 18), "北京");
        map.put(new Person("李三", 28), "上海");
        map.put(new Person("王五", 38), "广州");
        map.put(new Person("张三", 18), "上海");

        // keySet加增强 for 遍历 map集合
        Set<Person> set = map.keySet();
        for(Person key: set) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
