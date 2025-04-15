package datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;
import data.Node; // not use prev value

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        ++length;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        --length;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        ++length;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        --length;
        if (length == 0)
            tail = null;
        return temp;
    }

    public void printList() {
        System.out.println("\tPrintList!");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinkedList:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printHead() {
        System.out.println("Head: " + head.value);
    }

    public void printTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void printLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public Node get(int index) {
        if (index < 0 || index > length - 1)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean inset(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;

        ++length;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }
        Node node = get(index - 1);
        Node temp = node.next;
        node.next = temp.next;
        temp.next = null;
        --length;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        Node tortoise = head;
        Node hare = head;
        while (true) {
            if (hare.next == null) {
                break;
            }
            tortoise = tortoise.next;
            hare = hare.next;
            if (hare.next == null) {
                break;
            } else {
                hare = hare.next;
            }
        }
        return tortoise;
    }
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void partitionList(int x) {
        if (head == null) return;
        Node greaterHead = new Node(0);
        Node greaterTail = greaterHead;
        Node lessHead = new Node(0);
        Node lessTail = lessHead;
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                lessTail.next = current;
                lessTail = current;
            } else {
                greaterTail.next = current;
                greaterTail = current;
            }
            current = current.next;
        }
        lessTail.next = greaterHead.next;
        greaterTail.next = null;
        head = lessHead.next;
    }

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                --length;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    public int binaryToDecimal() {
        double num = 0.0;
        Node node = head;
        for (int i = 1; i <= length; i++) {
            num = (node.value) * (Math.pow(2.0, (double) (length - i))) + num;
            node = node.next;
        }
        return (int) num;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        // Check: If linked list is empty, nothing to reverse.
        // Exit the method.
        if (head == null) return;

        // Create a 'dummyNode' that precedes the head.
        // Simplifies handling edge cases.
        Node dummyNode = new Node(0);
        dummyNode.next = head;

        // 'previousNode' is used to navigate to the node
        // right before our sublist begins.
        Node previousNode = dummyNode;

        // Move 'previousNode' to node just before sublist.
        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        // 'currentNode' marks the first node of sublist.
        Node currentNode = previousNode.next;

        // Loop reverses the section from startIndex to endIndex.
        for (int i = 0; i < endIndex - startIndex; i++) {

            // 'nodeToMove' is the node we'll move to sublist start.
            Node nodeToMove = currentNode.next;

            // Detach 'nodeToMove' from its current position.
            currentNode.next = nodeToMove.next;

            // Attach 'nodeToMove' at the beginning of the sublist.
            nodeToMove.next = previousNode.next;

            // Move 'nodeToMove' to the start of our sublist.
            previousNode.next = nodeToMove;
        }

        // Adjust 'head' if the first node was part of sublist.
        head = dummyNode.next;
    }
}
