public class Test10 {
    public static void main(String[] args) {
        String num1 ="123456789";
        String num2 ="12345";
        int num_1=0;
        int num_2=0;
        for (int i = 0; i < num1.length(); i++) {
            int temp = charToNum(num1.charAt(i));
            num_1=num_1*10+temp;
        }
        System.out.println(num_1);
        for (int i = 0; i < num2.length(); i++) {
            int temp = charToNum(num2.charAt(i));
            num_2=num_2*10+temp;
        }
        System.out.println(num_2);
        int number = num_2*num_1;
        System.out.println(number);
    }

    public static int charToNum(char num){
        int number = num-48;
        return number;
    }
}
