public class Test4 {
    //找质数
    //判断101-200之间有多少个素数，并输出所有素数
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            find(i);
        }
    }

    public static void find(int num) {
        int flag = 1;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(num+"是质数");
        } else {
            System.out.println(num+"不是质数");
        }
    }
}
