package com.example.util.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsUsingBlockingQ {

    public static void main(String[] args) {
        BlockingQueue bq = new ArrayBlockingQueue(3);
        Thread t1 = new Thread(new Producer1(bq));
        Thread t2 = new Thread(new Consumer1(bq));
        t1.start();
        t2.start();

    }
}

class Producer1 implements  Runnable{

    private final BlockingQueue sharedQueue;

    Producer1(BlockingQueue sq){
        sharedQueue=sq;
    }

    @Override
    public void run() {
for(int i=0;i<10;i++){
    try {
        System.out.println("In Producer"+i);
        sharedQueue.put(i);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }
}

class Consumer1 implements  Runnable{

    private final BlockingQueue sharedQueue;

    Consumer1(BlockingQueue sq){
        sharedQueue=sq;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("In Consumer"+sharedQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
