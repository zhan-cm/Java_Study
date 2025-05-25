package threadDemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            多线程的第三种实现方式：
                特点：可以获取到多线程运行的结果

                1.创建一个类MyCallable实现Callable接口
                2.重写call（是有返回值的，表示多线程运行的结果）
                3.创建MyCallable的对象（表示多线程要执行的任务）
                4.创建FutureTask的对象（作用管理多线程运行的结果）
                5.创建Thread类的对象（表示线程）
         */
        //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable myCallable = new MyCallable();
        //创建FutureTask的对象（作用管理多线程运行的结果）
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        //创建Thread类的对象（表示线程）
        Thread thread = new Thread(futureTask);
        //启动线程
        thread.start();

        //获取多线程运行的结果
        String s = futureTask.get();
        System.out.println(s);
    }
}
