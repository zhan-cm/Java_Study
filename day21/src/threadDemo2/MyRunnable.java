package threadDemo2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //书写线程要执行的代码
        System.out.println("Hello World");
    }
}
