package com.fitnesscoder.queue;

public class MyQueue {
    int[] arr;
    int front;
    int rear;
    int size;

    public MyQueue(int n) {
        this.size=n;
        front=0;
        rear=0;
        arr=new int[size];
    }

    public boolean isEmpty() {
        if(front==rear) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        if(front==size) {
            return;
        }

        arr[rear]=data;
        rear++;
    }

    public int dequeue() {
        if(front==rear) {
            return -1;
        }

        int val=arr[front];
        front++;
        return val;
    }

    public int front() {
        if(front==rear) {
            return -1;
        }
        return arr[front];
    }

    public void printQueue() {
        for(int i=front; i<rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
