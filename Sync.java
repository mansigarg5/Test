package Multithreading;

public class Sync {
    int count;
    synchronized public void countIncrease(){
        count++;
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
        Sync sync = new Sync();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sync.sync1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sync.sync2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(sync.count);

    }
}
