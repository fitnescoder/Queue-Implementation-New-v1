package com.fitnesscoder.circularQueue;

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue circularQueue=new CircularQueue(3);
        System.out.println("===Adding to Circular Queue===");
        circularQueue.enqueue(5);
        circularQueue.enqueue(10);
        System.out.println("==Removing from Circular Queue==");
        System.out.println(circularQueue.dequeue());



    }
}
