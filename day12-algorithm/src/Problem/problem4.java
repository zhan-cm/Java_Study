package Problem;

public class problem4 {
    public static void main(String[] args) {
        int number =20;
        System.out.println(count(number));
    }

    private static long count(int number){
     if(number<=0){
         return 1;
     }
        else if(number ==1){
         return 1;
     }else if(number==2) {
         return 2;
     }else if(number ==3){
         return 4;
     }else{
         return count(number-1)+count(number-2)+count(number-3);
     }
    }
}
