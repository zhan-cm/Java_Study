package Test3;

public class bosoCat extends Cats{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁波斯猫，正在吃饼干");
    }
}
