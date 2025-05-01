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

    public void swapPairs() {
        if (length <= 1) return;
        Node current = head;
        do {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        } while (current != null);
    }

    public boolean isPalindrome() {
        if (length < 2) return true;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node left = slow.prev;
        Node right = (length % 2 == 0) ? slow : slow.next;
        while (left != null && right != null) {
            if (left.value != right.value) return false;
            left = left.prev;
            right = right.next;
        }
        return true;
    }

    public void reverse() {
        if (length < 2) return;
        Node current = head;
        head = tail;
        tail = current;
        while (current != null) {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
    }

    public void swapFirstLast() {
        if (length < 2) return;
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }

    public Node remove(int index) {
        if (index < 0 || index > length - 1) return null;
        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }
        Node before = get(index - 1);
        Node after = before.next.next;
        Node current = before.next;
        before.next = after;
        after.prev = before;
        current.prev = null;
        current.next = null;
        --length;
        return current;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0){
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node prev = get(index - 1);
        Node after = prev.next;
        prev.next = newNode; //
        newNode.prev = prev; //
        after.prev = newNode; //
        newNode.next = after; //
        ++length;
        return true;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp == null)
            return false;
        temp.value = value;
        return true;
    }

    public Node get(int index) {
        if (index < 0 || index > length - 1) return null;
        Node temp = null;
        if (index < length/2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
            length = 0;
            return temp;
        }
        head = head.next;
        head.prev = null;
        temp.next = null;
        --length;
        return temp;
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
        System.out.println("\tPrintAll!");
        System.out.println("head = " + head.value);
        System.out.println("tail = " + tail.value);
        System.out.println("length = " + length);
        printList();
    }
}
