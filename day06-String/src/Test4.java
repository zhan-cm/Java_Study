import  java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str =sc.next();

        for (int i = str.length()-1; i >= 0 ; i--) {
            char s = str.charAt(i);
            System.out.print(s);
        }
    }
}
