package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int FIRST_INDEX_OF_EMPTY_LIST = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrevious(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return FIRST_INDEX_OF_EMPTY_LIST;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return FIRST_INDEX_OF_EMPTY_LIST;
        int ret = last.getValue();
        last = last.getPrevious();
        return ret;
    }

    private static class Node {

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

    // 1.4 accesory 4 | Podczas wykonywania zadania nie zauwazylem zadnego nieuzywanego settera w repozytorium.
}