package Test3;

public class Dogs extends Animal{
    public Dogs() {
    }
    public Dogs(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"的狗两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }

}
