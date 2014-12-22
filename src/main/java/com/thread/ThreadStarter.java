package com.thread;


public class ThreadStarter {

    public static void main(String[] args){
        SayHelloExtend extend = new SayHelloExtend();
        extend.start();

        SayHelloImplement implement = new SayHelloImplement();
        Thread thread = new Thread(implement);

        thread.start();



    }
}
