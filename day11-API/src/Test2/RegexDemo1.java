package Test2;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "1234567890";

    }
    public static boolean checkQQ(String qq){
        int len = qq.length();
        if(len<6||len>20){
            return false;
        }
        char c = qq.charAt(0);
        if(c=='0'){
            return false;
        }
        return true;
    }
}
