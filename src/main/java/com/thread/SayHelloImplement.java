package com.thread;

public class SayHelloImplement implements Runnable{
    @Override
    public void run() {
        System.out.println("I am implementing Runnable");
    }
}
