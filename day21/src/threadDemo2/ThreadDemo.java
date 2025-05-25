package threadDemo2;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            多线程的第二种启动方式：
                1.自己定义一个类实现Runnable接口
                2.重写里面的run方法
                3.创建自己的类的对象
                4.创建一个Thread,并开启线程
         */
        MyRunnable mr = new MyRunnable();

        Thread thread = new Thread(mr);

        thread.start();

    }
}
