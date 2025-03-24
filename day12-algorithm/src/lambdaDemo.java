public class lambdaDemo {
    public static void main(String[] args) {

        method(()-> System.out.println("正在学游泳"));
    }
    public static void method(Swim s){
        s.swimming();
    }
}
interface Swim{
    public abstract void swimming();
}
