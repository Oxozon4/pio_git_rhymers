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

}