package io.github.pumpkinxd.examples.multithreading.rabbitandtortoise;

import java.util.concurrent.CountDownLatch;

public interface Operator extends Runnable {
    public void setCountDownLatch(CountDownLatch countDownLatch);
}
