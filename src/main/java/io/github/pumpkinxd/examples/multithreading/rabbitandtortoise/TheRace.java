package io.github.pumpkinxd.examples.multithreading.rabbitandtortoise;

import java.util.concurrent.CountDownLatch;

public interface TheRace {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdLatch=new CountDownLatch(1);
        Operator op0=new Amiya();
        Operator op1=new Coura();
        op0.setCountDownLatch(cdLatch);
        op1.setCountDownLatch(cdLatch);
        Thread t0=new Thread(op0);
        Thread t1=new Thread(op1);

        t0.start();
        t1.start();
        System.out.println("Starting!");
        cdLatch.countDown();
        t0.join();
        t1.join();
        //cdLatch.await();//starting

    }
}
