package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    Lock l1 = new ReentrantLock(true);
    Lock l2 = new ReentrantLock(true);
    public void acquireLock(Lock l1, Lock l2){
        boolean al1 = l1.tryLock();
        boolean al2 = l2.tryLock();
        if(al1 && al2){
            return;
        }
        if(al1) {
            l1.unlock();
        }
        if(al2){
            l2.unlock();
        }
    }
    public void sync1(){
        acquireLock(l1,l2);
        System.out.println("Lock1 thread1");
        System.out.println("Lock2 thread1");
        l1.unlock();
        l2.unlock();
    }
    public void sync2(){
        acquireLock(l2,l1);
        System.out.println("Lock2 thread2");
        System.out.println("Lock1 thread2");
        l2.unlock();
        l1.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        DeadlockDemo d = new DeadlockDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.sync1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                d.sync2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
