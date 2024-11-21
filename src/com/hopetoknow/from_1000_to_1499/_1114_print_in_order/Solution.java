package com.hopetoknow.from_1000_to_1499._1114_print_in_order;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

class Foo {
    private final CountDownLatch firstLatch = new CountDownLatch(1);
    private final CountDownLatch secondLatch = new CountDownLatch(1);

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

class Foo2 {
    private final Semaphore firstSemaphore = new Semaphore(0);
    private final Semaphore secondSemaphore = new Semaphore(0);

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

class Foo3 {
    private boolean isFirstExecuted = false;
    private boolean isSecondExecuted = false;

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        isFirstExecuted = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (!isFirstExecuted) {
            wait();
        }

        printSecond.run();
        isSecondExecuted = true;
        notify();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (!isSecondExecuted) {
            wait();
        }

        printThird.run();
    }
}

class Foo4 {
    private final Object monitor = new Object();
    private boolean isFirstExecuted = false;
    private boolean isSecondExecuted = false;

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (monitor) {
            printFirst.run();
            isFirstExecuted = true;
            monitor.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (monitor) {
            while (!isFirstExecuted) {
                monitor.wait();
            }

            printSecond.run();
            isSecondExecuted = true;
            monitor.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (monitor) {
            while (!isSecondExecuted) {
                monitor.wait();
            }

            printThird.run();
        }
    }
}
