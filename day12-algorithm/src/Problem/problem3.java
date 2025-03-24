package Problem;

public class problem3 {
    public static void main(String[] args) {
        int cnt =eat(10);
        System.out.println(cnt);
    }

    private static int eat(int number) {
        if(number==1){
            return 1;
        }else{
            return (eat(number-1)+1)*2;
        }
    }
}
