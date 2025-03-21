import java.util.Scanner;

public class Test6 {
    //需求
    //某系统的数字密码（大于0），比如1983，采用加密方式进行传输
    //规则：先得到每位数，然后每位数都加5，再对10求余，最后将所有数字反转
    public static void main(String[] args) {
        //输入一段数字
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字:");
        int number = sc.nextInt();

        //计算这串数字的个数，用于定数组的长度
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        //把数字导入数组中
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (number != 0) {
            int num = number % 10;
            number /= 10;
            arr[index] = num;
        }

        //加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        //反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temps = arr[i];
            arr[i] = arr[j];
            arr[j] = temps;
        }

        //打印最后结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
