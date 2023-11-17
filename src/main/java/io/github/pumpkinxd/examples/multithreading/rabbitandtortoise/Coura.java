package io.github.pumpkinxd.examples.multithreading.rabbitandtortoise;

import java.util.concurrent.CountDownLatch;

public class Coura implements Operator {
    CountDownLatch countDownLatch;
    @Override
    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //System.out.println("Where am I");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //codes here
        //System.out.println("hola");
        try {
            Thread.sleep(7000);
            //System.out.println("");//let Amiya win the race
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Coura reached finishing line");
    }
}
