import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int up=0;
        int low=0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp>='a'&&temp<='z'){
                low++;
            }else if(temp>='A'&&temp<='Z'){
                up++;
            } else if (temp>='0'&&temp<='9') {
                num++;
            }
        }
        System.out.println(up+","+low+","+num);
    }
}
