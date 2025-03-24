package Test5;

import java.util.regex.Matcher;

public class Try {
    public static void main(String[] args) {
        String str = "123456789";

        boolean b = str.matches("[0-9]\\d{0,9}");
        if(!b){
            System.out.println("不符合条件");
        }else{
            System.out.println("符合条件");
            int num = Integer.parseInt(str);
            System.out.println(num);
        }

    }
}
