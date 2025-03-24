package Test3;

public class Table_tennis_athletes extends Athletes implements English{
    public Table_tennis_athletes() {
    }

    public Table_tennis_athletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("台球运动员在学习打台球");
    }

    @Override
    public void english() {
        System.out.println("台球运动员会说英语");
    }
}
