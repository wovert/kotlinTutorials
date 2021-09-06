package com.wovert.java.collection;

public class NodeLoop {
    private String value;
    private NodeLoop next;
    private NodeLoop previous;

    public NodeLoop(String str) {
        this.value = str;
    }
    public static void main(String[] args) {
        NodeLoop node1 = new NodeLoop("node1");
        NodeLoop node2 = new NodeLoop("node2");
        NodeLoop node3 = new NodeLoop("node3");

        node1.next = node2;
        node2.previous = node1;

        node2.next = node3;
        node3.previous = node2;

        node3.next = node1;
        node1.previous = node3;
    }
}
