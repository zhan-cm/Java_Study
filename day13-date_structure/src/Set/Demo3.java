package Set;

import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {
        //利用TreeSet存储整数并进行排序
        TreeSet<Student> student = new TreeSet<>();
        Student s1 =new Student("zhangsan",23);
        Student s2 =new Student("lisi",24);
        Student s3 =new Student("wangwu",25);
        //Student s4 =new Student("zhangsan",23);

        student.add(s1);
        student.add(s2);
        student.add(s3);

        System.out.println(student);
    }
}
