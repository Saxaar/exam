package Concurrency;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();
    }
}

class MyThread extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println( "- " + i);
        }
    }
}