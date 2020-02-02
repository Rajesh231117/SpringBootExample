package com.example.util.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ProducerConsumerUsingWaitNotify {

    public static void main(String[] args) {
        Stack l = new Stack<>();
        Producer producer = new Producer(l, 3);
        Consumer consumer = new Consumer(l, 3);
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    Stack st;
    int size;

    Producer(Stack st, int size) {
        this.st = st;
        this.size = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            while (st.size() == size) {
                synchronized (st) {
                    try {
                        st.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            synchronized (st) {
                st.push(i);
                System.out.println("In Producer:" + i);
                st.notifyAll();
            }
        }
    }
}

class Consumer extends Thread {
    Stack st;
    int size;

    Consumer(Stack st, int size) {
        this.st = st;
        this.size = size;
    }

    @Override
    public void run() {
        while (true) {
            while (st.isEmpty()) {
                synchronized (st) {
                    try {
                        st.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            synchronized (st) {
                System.out.println("In Consumer:" + st.pop());
                st.notifyAll();
            }
        }

    }
}

