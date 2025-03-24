package Problem;

public class problem2 {
    public static void main(String[] args) {
//        int[] arr = new int[12];
//        arr[0]=1;
//        arr[1]=1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println(arr[11]);
        int number = 12;
        int result = Fibonaci(number);
        System.out.println(result);
    }
    public static int Fibonaci(int number){
        if(number == 1||number == 2){
            return 1;
        }else{
            return Fibonaci(number-1)+Fibonaci(number-2);
        }
    }
}
