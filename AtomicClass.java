package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {
    AtomicInteger count = new AtomicInteger();
    public void sync1(){
        for(int i=0;i<100000;i++)
            count.incrementAndGet();
    }
    public void sync2(){
        for(int i=0;i<100000;i++)
            count.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicClass a = new AtomicClass();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.sync1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.sync2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(a.count);

    }
}
