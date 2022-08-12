package com.fitnesscoder.KQueues;

public class KQueueDemo {
    public static void main(String[] args) {
        KQueue kQueue=new KQueue(10,3);
        kQueue.enqueue(10,1);
        kQueue.enqueue(15,1);
        kQueue.enqueue(20,2);
        kQueue.enqueue(25,1);

        System.out.println("===Dequeue from Queues===");
        System.out.println(kQueue.dequeue(1));
        System.out.println(kQueue.dequeue(2));
        System.out.println(kQueue.dequeue(1));
        System.out.println(kQueue.dequeue(1));
        System.out.println(kQueue.dequeue(1));

    }
}
