import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        int money;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请录入一个金额：");
            money = sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }

        //System.out.println(money);
        int index=0;
        String arr = "";
        while(true){
            int temp= money % 10;
            money=money/10;
            arr=getCapitalNumber(temp)+arr;
            index++;

            if(money==0){
                break;
            }
        }

        //补零
        int count = 7-arr.length();
        for (int i = 0; i < count; i++) {
            arr="零"+arr;
        }
        //System.out.println(arr);
        String[] str ={"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < arr.length(); i++) {
            char c = arr.charAt(i);
            System.out.print(c);
            System.out.print(str[i]);
        }

    }
    public static String getCapitalNumber(int money){
        String[] arr={"零","壹","贰","叁","肆",
                "伍","陆","柒","捌","玖"};
        return arr[money];
    }
}
