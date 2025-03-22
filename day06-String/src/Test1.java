import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        String rightUsername ="zhangsan";
        String rightPassword ="123456";


        Scanner sc = new Scanner(System.in);
        int count =3;//给用户三次输入机会


        while(count!=0) {
            System.out.println("请用户输入用户名：");
            String username = sc.next();
            System.out.println("请用户输入密码：");
            String password = sc.next();
            boolean result1 = rightPassword.equals(password);
            boolean result2 = rightUsername.equals(username);
            if(result2&&result1){
                System.out.println("用户名和密码输入正确");
                break;
            }else{
                if((count-1)==0){
                    System.out.println("您的账号已被冻结");
                    break;
                }
                System.out.println("用户名或密码输入错误,还剩"+(count-1)+"次机会");
            }
            count--;
        }
    }
}
