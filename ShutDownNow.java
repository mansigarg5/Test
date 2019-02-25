package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownNow {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is first thread executor.");
                }
            });
        }
        finally {
            executorService.shutdownNow();

        }

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Shutdown now: "+executorService.isShutdown());
        System.out.println("Terminated: "+executorService.isTerminated());
    }
}
