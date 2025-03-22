package Test3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args){
        Cars[] arr = new Cars[3];

        //创建汽车对象，数据来自于键盘录入
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            Cars c = new Cars();

            System.out.println("请输入汽车品牌：");
            String brand = sc.nextLine();
            c.setBrand(brand);

            System.out.println("请输入汽车价格：");
            double price= sc.nextDouble();
            c.setPrice(price);
            sc.nextLine();

            System.out.println("请输入汽车颜色：");
            String color = sc.nextLine();
            c.setColor(color);

            //把汽车对象添加到数组当中
            arr[i]=c;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Cars car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }
    }

}
