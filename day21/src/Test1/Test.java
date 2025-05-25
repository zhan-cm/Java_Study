package Test1;

public class Test {
    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();
        m1.setName("窗口1");
        m2.setName("窗口2");
        m1.start();
        m2.start();
    }

}
