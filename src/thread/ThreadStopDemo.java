package thread;

public class ThreadStopDemo {
    public static class MyThread extends Thread{

        public volatile boolean flag = true;

        @Override
        public void run() {
            super.run();
            while (flag) {
                System.out.println("hello");
            }
        }
    }
    public static void main(String[] msg){
        MyThread thread1 = new MyThread();
        thread1.start();

        try {
            Thread.sleep(2000);
            thread1.flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
