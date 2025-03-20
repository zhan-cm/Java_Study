import java.util.Random;

public class 求和并统计个数 {
    public static void main(String[] args){
        Random r = new Random(100);
        //int number =r.nextInt(100)+1;
        double sum=0;
        int [] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=r.nextInt(100)+1;
        }
        for (int i = 0; i < 10; i++) {
            sum+=arr[i];
        }
        double ave =sum/10;
        int count=0;
        for (int i = 0; i < 10; i++) {
            if(arr[i]<ave){
                count++;
            }
        }
        System.out.println("数据和为："+sum);
        System.out.println("平均数为："+ave);
        System.out.println("有"+count+"个数据小于平均值");
    }
}
