package Multithreading;

public class NotifyAll {
    public void fun1(){
        synchronized (this){
            System.out.println("Fun1 started!!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fun1 ended!!");
        }

    }
    public void fun2(){
        synchronized (this){
            System.out.println("Fun2 started!!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fun2 ended!!");
        }

    }
    public void fun3(){
        synchronized (this){
            System.out.println("Fun3 started!!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fun3 ended!!");
        }

    }
    public void fun4(){
        synchronized (this){
            System.out.println("Fun4 started!!");
            System.out.println("Fun4 ended!!");
            notifyAll();
        }

    }
    public static void main(String[] args) {
        NotifyAll w = new NotifyAll();
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
        new Thread(new Runnable() {
            @Override
            public void run() {
                w.fun3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                w.fun4();
            }
        }).start();
    }
}
