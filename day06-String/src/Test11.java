import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        int count =0;
        for (int i = 0; i < sb.length(); i++) {
            char temp = sb.charAt(i);
            if(temp==' '){
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
