package threadsafe1;

public class MyThread extends Thread{
    //表示这个类所有对象，都共享ticket数据
    static int ticket = 0;
    //锁对象------------一定要唯一
    static Object object = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (object){
                if(ticket<1000){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                }else{
                    break;
                }
            }
            Thread.yield();
        }
    }
}
