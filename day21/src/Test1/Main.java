package Test1;

import static java.lang.Thread.sleep;

public class Main extends Thread{

    static int ticket = 0;

    static Object object = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(object){
                if(ticket<1000){
                    try {
                        sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                    //还剩下多少张
                    System.out.println("还剩下"+(1000-ticket)+"张票");
                }else {
                    break;
                }
            }
            Thread.yield();
        }
    }
}
