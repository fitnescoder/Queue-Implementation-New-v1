package com.fitnesscoder.circularQueue;

public class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;

    public CircularQueue(int n) {
        this.size=n;
        arr=new int[size];
        front=0;
        rear=0;
    }

    public boolean enqueue(int value) {
        if((front==0 && rear==size-1) || (rear==front-1 && arr[rear]!=-1)) {
            return false;
        }

        arr[rear]=value;
        if(rear+1!=front)
            rear++;
        if(rear==size &&front!=0) {
            rear=0;
        }
        return true;
    }

    public int dequeue() {
        if(rear==front) {
            return -1;
        }

        int val=arr[front];
        arr[front]=-1;
        front++;
        if(front==size) {
            front=0;
        }
        return val;
    }


}
