package Test2;

public class manager extends Employee{
    private double bonus;

    public manager() {
    }

    public manager(String id, String name, int salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("管理其他人");
    }
}
