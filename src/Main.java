import datastructures.doublelinkedlist.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList myDll = new DoubleLinkedList(8);
        myDll.append(76);
        myDll.prepend( 17);
        myDll.printAll();
    }
}