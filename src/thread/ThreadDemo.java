package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {
    public static class MyThread extends Thread{

        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            super.run();
            System.out.println("Hello Mooncake " + name + Thread.currentThread().getId());
        }
    }
    public static void main(String[] msg){
        System.out.println("main tid = " + Thread.currentThread().getId());

        MyThread thread1 = new MyThread("hhaha");
        MyThread thread2 = new MyThread("xixixi");
        MyThread thread3 = new MyThread("hehehe");
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.run();
        thread2.run();
        thread3.run();


        MyRunable runnable1 = new MyRunable("1");
        MyRunable runnable2 = new MyRunable("2");
        new Thread(runnable1).start();
        new Thread(runnable2).start();

        // 原子计数
        // i++ 非原子操作的
        AtomicInteger integer = new AtomicInteger(0);
        integer.incrementAndGet(); // ++i;
        integer.getAndIncrement(); // i++;
    }
    public static class MyRunable implements Runnable{
        private String name;

        public MyRunable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("HelloFestival"+name + Thread.currentThread().getId());
        }
    }
}
