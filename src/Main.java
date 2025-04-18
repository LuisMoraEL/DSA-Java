import datastructures.doublelinkedlist.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList myDll = new DoubleLinkedList(8);
        myDll.append(76);
        myDll.prepend(17);
        myDll.append(78);
        myDll.append(43);
        myDll.insert(2, -45);
        System.out.println("DLL after insert in 2");
        myDll.printAll();
        System.out.println("Removing node [1]: " + myDll.remove(1).value);
        System.out.println("DLL after remove!");
        myDll.printAll();
    }
}