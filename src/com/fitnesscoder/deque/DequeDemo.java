package com.fitnesscoder.deque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque deque = new Deque(5);
        deque.pushFront(5);
        deque.pushRear(10);
        System.out.println("=== Removing from Deque ===");
        System.out.println(deque.popFront());
        System.out.println(deque.popRear());

    }


}
