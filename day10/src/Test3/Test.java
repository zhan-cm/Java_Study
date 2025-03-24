package Test3;

public class Test {
    public static void main(String[] args) {
        Table_tennis_athletes tsa = new Table_tennis_athletes("张三",19);
        System.out.println(tsa.getName()+","+tsa.getAge());
        tsa.learn();
        tsa.english();
    }
}
