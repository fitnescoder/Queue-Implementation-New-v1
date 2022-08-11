package com.fitnesscoder.queue;

public class MyQueueDemo {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(5);
        System.out.println("===Adding Values to Queue===");
        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.enqueue(25);

        System.out.println("===Print Queue===");
        myQueue.printQueue();

        System.out.println("===After removing two elements===");
        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.printQueue();

        System.out.println("is Empty? :"+myQueue.isEmpty());

        System.out.println("Front element :"+myQueue.front());
    }
}
