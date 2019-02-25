package Multithreading;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() {
                    return 5;
                }
            });
            executorService.shutdown();
        if(integerFuture.isDone())
        {
            System.out.println("Done: "+integerFuture.isDone());
            System.out.println("Get: "+integerFuture.get());
        }
        System.out.println("Cancelled: "+integerFuture.isCancelled());
    }
}
