package Multithreading;

public class SyncBlock {
        int count;
        public void countIncrease() {

            synchronized (this) {
                count++;
            }
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
            SyncBlock sync = new SyncBlock();
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

