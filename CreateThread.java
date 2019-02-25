package Multithreading;

class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("This is Runnable class thread.");
    }
}

class ThreadDemo extends Thread{
    public void run(){
        System.out.println("This is Thread class thread.");
    }
}

public class CreateThread {
    public static void main(String[] args) {
        new Thread(new RunnableDemo()).start();
        new Thread(new ThreadDemo()).start();
    }
}
