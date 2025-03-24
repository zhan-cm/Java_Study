package Test3;

public class Basketball_coaches extends Coaches{
    public Basketball_coaches() {
    }

    public Basketball_coaches(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教打篮球");
    }
}
