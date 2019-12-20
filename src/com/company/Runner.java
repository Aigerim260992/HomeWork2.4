package com.company;

public class Runner extends Thread {

    Thread runnable1 = new Thread();
    Thread runnable2 = new Thread();
    Thread runnable3 = new Thread();
    Thread runnable4 = new Thread();
    Thread runnable5 = new Thread();

    @Override
    public void run() {
        try {
            runnable1.setName("Runner1");
            runnable2.setName("Runner2");
            runnable3.setName("Runner3");
            runnable4.setName("Runner4");
            runnable5.setName("Runner5");

            System.out.println(runnable1.getName() + " берет палочку");
            System.out.println(runnable1.getName() + " бежит к " + runnable2.getName());
            runnable1.start();
            runnable1.sleep(5000);

            System.out.println(runnable2.getName() + " берет палочку");
            System.out.println(runnable2.getName() + " бежит к " + runnable3.getName());
            runnable2.start();
            runnable2.sleep(5000);

            System.out.println(runnable3.getName() + " берет палочку");
            System.out.println(runnable3.getName() + " бежит к " + runnable4.getName());
            runnable3.start();
            runnable3.sleep(5000);

            System.out.println(runnable4.getName() + " берет палочку");
            System.out.println(runnable4.getName() + " бежит к " + runnable5.getName());
            runnable4.start();
            runnable4.sleep(5000);

            System.out.println(runnable5.getName() + " берет палочку");
            System.out.println(runnable5.getName() + " бежит к финишу");
            runnable5.start();
            runnable5.sleep(5000);


            System.out.println(runnable5.getName() + " бежит к " + runnable4.getName());
            runnable4.sleep(5000);

            System.out.println(runnable4.getName() + " берет палочку");
            System.out.println(runnable4.getName() + " бежит к " + runnable3.getName());
            runnable3.sleep(5000);

            System.out.println(runnable3.getName() + " берет палочку");
            System.out.println(runnable3.getName() + " бежит к " + runnable2.getName());
            runnable3.sleep(5000);


            System.out.println(runnable2.getName() + " берет палочку");
            System.out.println(runnable2.getName() + " бежит к " + runnable1.getName());
            runnable2.sleep(5000);


            System.out.println(runnable1.getName() + " берет палочку");
            runnable1.sleep(5000);


        } catch (Exception e) {
        }

    }
}
