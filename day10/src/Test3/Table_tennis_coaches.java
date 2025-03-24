package Test3;

public class Table_tennis_coaches extends Coaches implements English{
    public Table_tennis_coaches() {
    }

    public Table_tennis_coaches(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("台球教练在教打台球");
    }

    @Override
    public void english() {
        System.out.println("台球教练会说英语");
    }
}
