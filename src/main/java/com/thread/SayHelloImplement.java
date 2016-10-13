package com.thread;

public class SayHelloImplement implements Runnable{
    private int i;
    public SayHelloImplement(){

    }
    public SayHelloImplement(int i){
        this.i = i;
    }
    public void run() {
        System.out.println("I am implementing Runnable:"+i);
    }

}
