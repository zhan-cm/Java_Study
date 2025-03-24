package Test3;

public class Cats extends Animal{
    public Cats() {
    }

    public Cats(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的猫咪眯着眼睛侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫在逮老鼠");
    }
}
