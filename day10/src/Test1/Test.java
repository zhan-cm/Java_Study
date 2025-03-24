package Test1;

public class Test {
    public static void main(String[] args) {
        frog f = new frog("小绿",1);
        System.out.println(f.getName()+","+f.getAge());
        f.drink();
        f.eat();
    }

}
