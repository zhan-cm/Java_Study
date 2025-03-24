package Test2;

public class Test
{
    public static void main(String[] args) {
        Frog f= new Frog("xiaoqing",1);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.swim();
    }

}
