package com.company;

public class Main {

    public static void main(String[] args) throws  InterruptedException{

        Runner runner = new Runner();
        runner.start();

        runner.runnable1.start();
        runner.runnable2.start();
        runner.runnable3.start();
        runner.runnable4.start();
        runner.runnable5.start();
    }
}
