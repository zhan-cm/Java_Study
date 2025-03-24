package Test3;

public abstract class Athletes extends Person{
    public Athletes(){

    }
    public Athletes(String name ,int age){
        super(name, age);
    }
    public abstract void learn();
}
