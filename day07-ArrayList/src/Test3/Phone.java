package Test3;

public class Phone {
    private String brand;
    private int age;

    public Phone() {
    }

    public Phone(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
