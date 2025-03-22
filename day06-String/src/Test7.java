import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("输入一个字符串：");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                System.out.println("输入成功");
                break;
            }else{
                System.out.println("当前字符串不符合条件，请重新输入");
                continue;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c-48;
            s.append(toRome(number));
            System.out.println(s);
        }







    }



    public static String toRome(int number){

        String[] str={" ","I","II","III","IV","V","VI",
                "VII","VIII","IX"};
        return str[number];
    }




    public static boolean checkStr(String str){
        //长度小于9
        if(str.length()>9){
            return false;
        }
        //只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}
