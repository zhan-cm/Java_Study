import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        String str="abcdefg";
        Random r = new Random();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i]=arr[number];
            arr[number]=temp;
        }
        String result = new String(arr);
        System.out.println(result);

    }
}
