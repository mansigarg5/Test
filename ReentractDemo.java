package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentractDemo {
    Lock l = new ReentrantLock(true);
    int count;
    public void countIncrease() {
        l.lock();
        count++;
        l.unlock();
    }
    public void sync1(){
        for(int i=0;i<100000;i++)
            countIncrease();
    }
    public void sync2(){
        for(int i=0;i<100000;i++)
            countIncrease();
    }

    public static void main(String[] args) throws InterruptedException {
        ReentractDemo r = new ReentractDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                r.sync1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                r.sync2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(r.count);

    }

}
