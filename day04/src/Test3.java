import java.util.Scanner;

public class Test3 {
    //买飞机票
    //机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱
    //按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折
    //淡季（11月到来年4月）头等舱7折，经济舱6.5折
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入机票原价");
        double original = sc.nextDouble();

        System.out.println("输入月份");
        int month = sc.nextInt();

        System.out.println("你是头等舱还是经济舱:经济舱输入1，头等舱输入0");
        int option = sc.nextInt();

        double price = caclprice(original, month, option);
        System.out.println("你的飞机票价格实际为：" + price);
    }

    public static double caclprice(double price, int month, int option) {
        double result;
        if (month >= 5 && month <= 10) {
            if (option == 1) {
                result = price * 0.85;
            } else {
                result = price * 0.9;
            }
        } else {
            if (option == 1) {
                result = price * 0.65;
            } else {
                result = price * 0.7;
            }
        }
        return result;
    }
}
