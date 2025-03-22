package Test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //创建集合的对象
        ArrayList<Student> list=new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生名字：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            list.add(s);
        }


    }



}
