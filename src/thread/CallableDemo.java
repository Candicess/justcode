package thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable - 带返回结果的子线程
 * 与FutureTask结合使用，见名知意，常用于事先加载未来的内容，
 * 如浏览器事先加载下一页的内容，当用户点击了下一页时，可直接使用futuretask.get()来获取加载好的内容
 */
public class CallableDemo {

    public static void main(String[] msg){
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                // 注意这里的线程方法执行完后是有返回值的，而Runnable的run方法返回值是void
                return new Random().nextInt(100);
            }
        };
        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        new Thread(future).start();

        try {
            // 做一些事情
            Thread.sleep(3000);
            // 拿到线程的执行结果
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}