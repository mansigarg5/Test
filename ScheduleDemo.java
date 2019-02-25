package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDemo {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a thread with delay 1s");
            }
        },1,TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a thread with delay 2s");
            }
        },1,1,TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a thread with delay 3s");
            }
        },1,2,TimeUnit.SECONDS);
    }
}
