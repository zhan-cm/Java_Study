package Test2;

public class cooker extends Employee {
    public cooker() {
    }

    public cooker(String id, String name, int salary) {
        super(id, name, salary);
    }
    public void work(){
        System.out.println("在炒菜");
    }
}
