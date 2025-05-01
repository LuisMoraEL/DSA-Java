import datastructures.queue.Queue;
import datastructures.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.dequeue();
        myQueue.printAll();
    }
}