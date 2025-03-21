import java.util.Random;
import java.util.Scanner;

public class Test8 {
    // 双色球系统主方法
    public static void main(String[] args) {
        // 生成系统随机的双色球号码
        int[] arr = createNumber();

        /*
        中奖号码
        System.out.println("中奖号码是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(i=arr.length-1){
                System.out.println("arr[i]");
            }
        }
        */

        // 获取用户输入的双色球号码
        int[] userNumbers = userInput();

        //判断用户中奖情况
        int redcount=0;
        int bluecount=0;

        //判断红球
        for (int i = 0; i < userNumbers.length-1; i++) {
            int rednumber = userNumbers[i];
            for (int j = 0; j < userNumbers.length-1; j++) {
                if(rednumber==arr[j]){
                    redcount++;
                    break;
                }
            }
        }

        int bluenumber = userNumbers[userNumbers.length-1];
        if (bluenumber == arr[arr.length-1])
            bluecount++;

        //几等奖？
        rich(redcount,bluecount);
    }

    //中奖情况
    public static void rich(int red,int blue){
        if(red==6&&blue==1){
            System.out.println("一等奖");
        }else if(red==6&&blue==0){
            System.out.println("二等奖");
        }else if(red==5&&blue==1){
            System.out.println("三等奖");
        }else if(red==5&&blue==0){
            System.out.println("四等奖");
        }else if(red==4&&blue==1){
            System.out.println("四等奖");
        }else if(red==4&&blue==0) {
            System.out.println("五等奖");
        }else if(red==3&&blue==1) {
            System.out.println("五等奖");
        }else if(red==2&&blue==1) {
            System.out.println("五等奖");
        }else if(red==1&&blue==1) {
            System.out.println("六等奖");
        }else if(red==0&&blue==1) {
            System.out.println("六等奖");
        }else{
            System.out.println("很遗憾没中奖");
        }
    }
    // 用户输入双色球号码的方法
    public static int[] userInput() {
        int[] arr = new int[7]; // 创建一个长度为7的数组来存储用户输入的号码

        Scanner sc = new Scanner(System.in); // 创建Scanner对象用于读取用户输入

        // 输入6个红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("输入第" + (i + 1) + "个红球号码"); // 提示用户输入第i+1个红球号码
            int redNumber = sc.nextInt(); // 读取用户输入的红球号码

            // 检查红球号码是否在1到33之间
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber); // 检查该号码是否已经存在于数组中

                // 如果号码不存在于数组中，则将其添加到数组中
                if (!flag) {
                    arr[i] = redNumber;
                    i++; // 增加计数器，表示已成功输入一个红球号码
                } else {
                    System.out.println("已存在，重新输入"); // 如果号码已存在，提示用户重新输入
                }
            } else {
                System.out.println("超出范围"); // 如果号码不在1到33之间，提示用户超出范围
            }
        }

        // 输入蓝球号码
        System.out.println("输入蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt(); // 读取用户输入的蓝球号码

            // 检查蓝球号码是否在1到16之间
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber; // 将蓝球号码存储到数组的最后一个位置
                break; // 跳出循环，结束蓝球号码的输入
            } else {
                System.out.println("超出范围，重新输入"); // 如果号码不在1到16之间，提示用户超出范围
            }
        }
        return arr; // 返回包含用户输入的双色球号码的数组
    }

    // 生成系统随机双色球号码的方法
    public static int[] createNumber() {
        int[] arr = new int[7]; // 创建一个长度为7的数组来存储系统生成的号码

        Random r = new Random(); // 创建Random对象用于生成随机数

        // 生成6个红球号码
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1; // 生成1到33之间的随机数作为红球号码
            boolean flag = contains(arr, redNumber); // 检查该号码是否已经存在于数组中

            // 如果号码不存在于数组中，则将其添加到数组中
            if (!flag) {
                arr[i] = redNumber;
                i++; // 增加计数器，表示已成功生成一个红球号码
            }
        }

        int blueNumber = r.nextInt(16) + 1; // 生成1到16之间的随机数作为蓝球号码
        arr[arr.length - 1] = blueNumber; // 将蓝球号码存储到数组的最后一个位置

        return arr; // 返回包含系统生成的双色球号码的数组
    }

    // 检查数组中是否包含某个号码的方法
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) { // 如果数组中存在该号码，返回true
                return true;
            }
        }
        return false; // 如果数组中不存在该号码，返回false
    }
}