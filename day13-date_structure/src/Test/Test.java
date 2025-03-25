package Test;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan",23,90,99,50);
        Student2 s2 = new Student2("lisi",24,90,98,50);
        Student2 s3 = new Student2("wangwu",25,95,100,30);
        Student2 s4 = new Student2("zhaoliu",26,60,99,70);
        Student2 s5 = new Student2("qinaqi",27,60,99,70);

        TreeSet<Student2> s = new TreeSet<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        for (Student2 student2 : s) {
            System.out.println(student2+("sum="+(student2.getChinese()+student2.getMathematics()+student2.getEnglish())));
        }
    }
}
