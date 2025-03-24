package Test1;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhangsan","1234qwer","girl11",data);

        //克隆
        Object u2 = u1.clone();
        System.out.println(u1);
        System.out.println(u2);
    }
}
