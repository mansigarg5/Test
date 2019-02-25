package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleThreads {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is first single thread executor.");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                        System.out.println("This is second single thread executor.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is third single thread executor.");
                }
            });
        }
        finally {
            executorService.shutdown();
        }
    }
}
