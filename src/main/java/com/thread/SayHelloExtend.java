package com.thread;


public class SayHelloExtend extends Thread {
    @Override
    public void run(){
        System.out.println("I am extending a thread!");
    }
}
