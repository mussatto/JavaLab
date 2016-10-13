package com.thread;


public class ThreadStarter {

    public static void main(String[] args){
        SayHelloExtend extend = new SayHelloExtend();
        extend.start();

        SayHelloImplement implement = new SayHelloImplement();
        Thread thread = new Thread(implement);

        thread.start();

        // Java 8 style
        Runnable task = () -> {
            System.out.println("I am saying hello in a Java 8 style");
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am saying hello in a Java");
            }
        };

        Thread newJavaWayThread = new Thread(task);

        newJavaWayThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
