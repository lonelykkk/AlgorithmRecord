package leetcode.笔试;

public class Main {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Printer(), "Thread-1");
        Thread thread2 = new Thread(new Printer(), "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class Printer implements Runnable {
        @Override
        public void run() {
            while (number <= 100) {
                synchronized (lock) {
                    if (number > 100) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify();
                    try {
                        if (number <= 100) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}