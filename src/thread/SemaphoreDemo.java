package thread;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] msg){
        semaphore();

    }
    private static void join(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("join T1");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("join T2");
            }
        });

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }

    private static void semaphore() {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    System.out.println("666");
                    semaphore.release(2);

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire(2);
                    System.out.println("hahaha");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release(3);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire(3);
                    System.out.println("2333333");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaphore.release(4);
            }
        }).start();
    }
}
