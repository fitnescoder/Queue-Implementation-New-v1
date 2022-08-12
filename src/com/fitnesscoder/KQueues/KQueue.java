package com.fitnesscoder.KQueues;

public class KQueue {
    int[] arr;
    int[] front;
    int[] rear;
    int[] next;
    int size;
    int k;
    int freespot;

    public KQueue(int size, int k) {
        this.size = size;
        this.k = k;
        arr = new int[size];
        next = new int[size];
        front = new int[k];
        rear = new int[k];

        //initializing front and rear arrays
        for (int i = 0; i < k; i++) {
            front[i] = -1;
            rear[i] = -1;
        }

        //initializing next array
        for (int i = 0; i < size; i++) {
            next[i] = i + 1;
        }

        next[size - 1] = -1;
        freespot = 0;
    }

    public void enqueue(int data, int qn) {
        //check overflow
        if (freespot == -1) {
            System.out.println("Queue overflow!!");
            return;
        }

        //index to insert
        int index = freespot;
        //update freespot
        freespot = next[index];
        //check if its first element to insert
        if (front[qn - 1] == -1) {
            front[qn - 1] = index;
        } else {
            //link it with next element
            next[rear[qn - 1]] = index;
        }

        //once updated free space is taken
        next[index] = -1;

        //update rear
        rear[qn - 1] = index;
        //insert element
        arr[index] = data;
    }

    public int dequeue(int qn) {
        //check underflow
        if (front[qn - 1] == -1) {
            System.out.println("Queue is Underflow!!");
            return -1;
        }

        //get index to perform dequeue
        int index = front[qn - 1];
        //update front
        front[qn - 1] = next[index];
        //update next array for upcoming free spot
        next[index] = freespot;
        //update freespot
        freespot = index;
        //pop element
        return arr[index];
    }
}
