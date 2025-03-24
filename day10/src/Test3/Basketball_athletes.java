package Test3;

public class Basketball_athletes extends Athletes{
    public Basketball_athletes() {
    }

    public Basketball_athletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员在学习打篮球已经两年半了");
    }
}
