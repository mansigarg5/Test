package Multithreading;

public class WaitAndNotify {
    public void fun1(){
        synchronized (this){
            System.out.println("Thread1 started!!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 ended!!");
        }

    }
    public void fun2(){
        synchronized (this){
            System.out.println("Thread2 started!!");
            System.out.println("Thread2 ended!!");
            notify();
        }

    }
    public static void main(String[] args) {
        WaitAndNotify w = new WaitAndNotify();
        new Thread(new Runnable() {
            @Override
            public void run() {
                w.fun1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                w.fun2();
            }
        }).start();
    }
}
