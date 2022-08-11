package com.fitnesscoder.deque;

import javax.sql.rowset.FilteredRowSet;

public class Deque {
    int[] arr;
    int front;
    int rear;
    int size;

    public Deque(int n) {
        this.size = n;
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    public boolean pushFront(int x) {
        if ((front == 0 && rear == size - 1) || (rear == front - 1 && arr[rear] != -1)) {
            return false;
        } else if (front == -1) {
            front = rear = 0;
        } else if (front == 0 && rear != size - 1) {
            front = size - 1;
        } else if (front - 1 != rear) {
            front--;
        }

        arr[front] = x;
        return true;

    }

    public boolean pushRear(int x) {
        if ((front == 0 && rear == size - 1) || (rear == front - 1 && arr[rear] != -1)) {
            return false;
        } else if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else if (rear + 1 != front) {
            rear++;
        }

        arr[rear] = x;
        return true;
    }

    public int popFront() {
        if (front == -1) {
            return -1;
        }
        int val = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            arr[front] = -1;
            front++;
        }

        return val;
    }

    public int popRear() {
        if (front == -1) {
            return -1;
        }
        int val = arr[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            arr[rear] = -1;
            rear--;
        }
        return val;
    }

    public int getFront() {
        if (front == -1) {
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (front == -1) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (rear == front - 1 && arr[rear] != -1)) {
            return true;
        }
        return false;
    }

}
