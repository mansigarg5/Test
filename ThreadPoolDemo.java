package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++)
        {
            executorService.submit(new Task(i,"C"));
        }

        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        for(int i=0;i<5;i++)
        {
            executorService1.submit(new Task(i,"F"));
        }
        executorService.shutdown();
        executorService1.shutdown();
    }
}
class Task implements Runnable{
    int i;
    String c;
    public Task(int i,String c){
        this.i = i;
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println("This is thread "+this.i+" created by "+c);

    }
}
