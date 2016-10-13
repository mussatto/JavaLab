package com.executors;

import com.thread.SayHelloImplement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsThread {

    public void runSample() throws InterruptedException {
        ExecutorService service =  Executors.newSingleThreadExecutor();
        for(int i=0;i<10000;i++){
            service.execute(new SayHelloImplement(i));
        }

        Thread.sleep(1000);
    }

    public void runSample2() throws InterruptedException {
        ExecutorService service =  Executors.newFixedThreadPool(10);
        for(int i=0;i<10000;i++){
            service.execute(new SayHelloImplement(i));
        }

        Thread.sleep(1000);
    }
}
