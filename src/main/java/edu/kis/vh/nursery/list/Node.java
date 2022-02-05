package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    public void setPrevious(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getPrevious() {
        return prev;
    }
}