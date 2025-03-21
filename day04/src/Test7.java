import java.util.Random;

public class Test7 {
    //随机抽奖，分别有{2，588，888，1000，10000}
    public static void main(String[] args){
        int[] arr={2,588,888,1000,10000};
        Random r= new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(5);

            int temp= arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
