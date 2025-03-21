import java.util.Random;

//动态验证码
public class Test5 {
    public static void main(String[] args){

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){
                chs[i]=(char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }

        Random sc=new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex= sc.nextInt(chs.length);
            System.out.print(chs[randomIndex]);
        }
        int randomnum=sc.nextInt(8)+1;
        System.out.print(randomnum);

    }
}
