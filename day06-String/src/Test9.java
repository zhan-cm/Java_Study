import java.util.Random;


public class Test9 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char) (97 + i);
            } else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        //生成五位数验证码，内容可以是大写字母，也可以是小写字母，或者是数字，四个字母一个数字，顺序可以打乱
        StringBuilder sb = new StringBuilder();

        Random r = new Random();

        int num1 = r.nextInt(10);

        for (int i = 0; i < 4; i++) {

            int num2 = r.nextInt(52);
            sb.append(arr[num2]);
        }

        sb.append(num1);
        //System.out.println(sb);
        //打乱字符串
        for (int i = 0; i < sb.length(); i++) {

            int number = r.nextInt(sb.length());
            char temp1 = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(number));
            sb.setCharAt(number, temp1);

        }
        String result = sb.toString();
        System.out.println(result);
    }
}
