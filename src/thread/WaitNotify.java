package thread;

public class WaitNotify {
    public static class MyThread1 extends Thread{
        private Object object;

        public MyThread1(Object object) {
            this.object = object;
        }

        @Override
        public void run() {
            super.run();
            synchronized (object) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1 notify before");
                object.notify();
                System.out.println("T1 notify after");
            }
        }
    }

    public static class MyThread2 extends Thread{
        private Object object;

        public MyThread2(Object object) {
            this.object = object;
        }

        @Override
        public void run() {
            super.run();
            System.out.println("T2 run begin" + Thread.currentThread().getId());
            synchronized (object) {
                try {
                    System.out.println("T2 await before");
                    object.wait();
                    System.out.println("T2 await after");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] msg){
        Object object = new Object();
        MyThread1 thread1 = new MyThread1(object);
        MyThread2 thread2 = new MyThread2(object);
        thread1.start();
        thread2.start();
    }
}