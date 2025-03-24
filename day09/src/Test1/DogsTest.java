package Test1;

public class DogsTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        System.out.println("哈士奇");
        h.eat();
        h.breakHouse();
        h.drink();
        h.housekeeping();
        SharPei s = new SharPei();
        System.out.println("沙皮狗");
        s.eat();
        s.drink();
        s.housekeeping();
        ChineseDogs c = new ChineseDogs();
        System.out.println("中华田园犬");
        c.eat();
        c.drink();
        c.housekeeping();
    }
}
