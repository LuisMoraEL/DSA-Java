package datastructures.stack;

import data.Node;

public class Stack {
    private Node top;
    private int height = 0;

    public Stack() {}

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public Node pop() {
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        --height;
        return temp;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        ++height;
    }

    public void printAll() {
        System.out.println("<------------- Stack ------------->");
        getTopValue();
        getHeightValue();
        printStack();
    }

    public void printStack() {
        Node temp = top;
        int index = height - 1;
        while (temp != null) {
            System.out.println(index + ".- " + temp.value);
            temp = temp.next;
            --index;
        }
    }

    public void getTopValue() {
        System.out.println("top = " + top.value);
    }

    public void getHeightValue() {
        System.out.println("height = " + height);
    }
}
