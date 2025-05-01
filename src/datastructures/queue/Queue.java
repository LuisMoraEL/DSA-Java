package datastructures.queue;

import data.Node;

public class Queue {
    private Node first;
    private Node last;
    private int lenght = 0;

    public Queue() {}

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        lenght = 1;
    }

    public Node dequeue() {
        if (lenght == 0) return null;
        Node temp = first;
        if (lenght == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        --lenght;
        return temp;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (lenght == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        ++lenght;
    }

    public void printAll() {
        System.out.println("Print All Queue!!!");
        getFirstValue();
        getLastValue();
        getLenghtValue();
        printQueue();
    }

    public void printQueue() {
        Node temp = first;
        int index = 0;
        while (temp != null) {
            System.out.println(index + ".- " + temp.value);
            temp = temp.next;
            index++;
        }
    }

    public void getFirstValue() {
        System.out.println("first = " + first.value);
    }

    public void getLastValue() {
        System.out.println("last = " + last.value);
    }

    public void getLenghtValue() {
        System.out.println("lenght = " + lenght);
    }
}
