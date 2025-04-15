package datastructures.doublelinkedlist;

import data.Node;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public DoubleLinkedList() {}

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        ++length;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
        ++length;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        --length;
        return temp;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        ++length;
    }

    public void getHeadValue() {
        System.out.println("head = " + head.value);
    }

    public void getTailValue() {
        System.out.println("tail = " + tail.value);
    }

    public void getlengthValue() {
        System.out.println("length = " + length);
    }

    public void printList() {
        Node temp = head;
        System.out.println("List Values: ");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void printAll() {
        System.out.println("head = " + head.value);
        System.out.println("tail = " + tail.value);
        System.out.println("length = " + length);
        printList();
    }
}
