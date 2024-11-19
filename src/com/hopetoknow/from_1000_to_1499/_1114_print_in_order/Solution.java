package com.hopetoknow.from_1000_to_1499._1114_print_in_order;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

class Foo {
    private final CountDownLatch firstLatch = new CountDownLatch(1);
    private final CountDownLatch secondLatch = new CountDownLatch(1);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        firstLatch.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        firstLatch.await();
        printSecond.run();
        secondLatch.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondLatch.await();
        printThird.run();
    }
}

class Foo1 {
    private final Semaphore firstSemaphore = new Semaphore(0);
    private final Semaphore secondSemaphore = new Semaphore(0);

    public Foo1() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        firstSemaphore.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        firstSemaphore.acquire();
        printSecond.run();
        secondSemaphore.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondSemaphore.acquire();
        printThird.run();
    }
}
