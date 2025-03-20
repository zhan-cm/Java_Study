import java.util.Scanner;
import java.util.Random;
public class easycacl {
    public static void main(String[] args){
        //生成随机数
        Random r=new Random();
        int number = r.nextInt(101);

        Scanner sc = new Scanner(System.in);

        //无限循环直到才到数字
        while(true) {
            System.out.println("输入一个数字：");
            int num = sc.nextInt();

            if (num > number) {
                System.out.println("大了，再来");

            } else if (num < number) {
                System.out.println("小了，再来");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        }

    }
