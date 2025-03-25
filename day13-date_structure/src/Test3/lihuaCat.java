package Test3;

public class lihuaCat extends Cats{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁狸花猫，正在吃鱼");
    }
}
