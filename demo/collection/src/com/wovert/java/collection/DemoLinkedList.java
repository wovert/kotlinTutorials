package com.wovert.java.collection;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        System.out.println(ll);

        ll.addFirst("0");
        ll.push("zero");
        System.out.println(ll);
        ll.addLast("zzz");
        System.out.println(ll);
        System.out.println("--------");

//        ll.clear();
        if (!ll.isEmpty()) {
            String first = ll.getFirst();
            String last = ll.getLast();
            System.out.println(first);
            System.out.println(last);
            System.out.println(ll);
            System.out.println("--------");
        }

        String removeFrist = ll.removeFirst();
        String removeFrist2 = ll.pop();
        String removeLast = ll.removeLast();
        System.out.println(removeFrist);
        System.out.println(removeFrist2);
        System.out.println(removeLast);
        System.out.println(ll);
        System.out.println("--------");
    }
}
