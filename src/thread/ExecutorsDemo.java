package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorsDemo {
    public static void main(String[] msg){
        AtomicInteger integer = new AtomicInteger(0);
        ExecutorService executors = Executors.newCachedThreadPool();
        while (true) {
            executors.execute(new MyRunnable(integer.getAndIncrement() + ""));
            integer.incrementAndGet();
        }
    }

    static class MyRunnable implements Runnable {

        private String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("run " + name);
        }
    }
}
