package Test3;

public class Test {
    public static void main(String[] args) {
        Dogs dog = new Dogs(2,"黑");
        Cats cat = new Cats(3,"灰");

        Person p = new Person("老王",30);
        p.keepPet(dog,"骨头");
        p.keepPet(cat,"鱼");
    }
}
