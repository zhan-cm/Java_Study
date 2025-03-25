package Test3;

public class taidiDog extends Dogs{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁泰迪，正在吃骨头，边吃边蹭");
    }
}
