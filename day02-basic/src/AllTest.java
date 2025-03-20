import java.util.Scanner;

public class AllTest {
    //健康计算机
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入身高:");
        double height = sc.nextDouble();

        System.out.println("输入体重:");
        double weight = sc.nextDouble();

        System.out.println("输入年龄:");
        int age = sc.nextInt();

        System.out.println("输入性别:(男/女)");
        String sex = sc.next();

        double BMI = caclBMI(height,weight);
        System.out.println("BMI值为"+BMI);

        double BMR = caclBMR(height,weight,age,sex);
        System.out.println("BMR值为"+BMR);
    }

    public static double caclBMI(double height, double weight) {
        return weight / (height * height);
    }
    public static double caclBMR(double height,double weight,int age,String sex){
        double BMR=0;
        if(sex.equals("男")){
            BMR=66+(13.7*weight)+(5*height)-(6.8*age);
        }else if(sex.equals("女")){
            BMR=655+(9.6*weight)+(1.8*height)-(4.7*age);
        }
        return BMR;
    }
}