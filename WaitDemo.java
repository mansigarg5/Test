package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> list = new ArrayList<>();
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<Integer>> list2 = executorService.invokeAll(list);
        executorService.shutdown();
        executorService.awaitTermination(1000L,TimeUnit.SECONDS);
        for(Future<Integer> l: list2){
            if(l.isDone())
            {
                System.out.println("The value of thread is: "+l.get());
            }
        }
    }
}

