package Test1;

public class frog extends Animal {
    public frog(){}
    public frog(String name,int age){
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
}
