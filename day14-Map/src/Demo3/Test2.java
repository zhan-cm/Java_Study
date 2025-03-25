package Demo3;

import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        /*
        需求2：
            键：学生对象
            值：籍贯
            要求：按照学生年龄按照的升序排列，年龄一样按照姓名字母，
            同姓名同年龄视为一个人
         */
        TreeMap<Student,String> t = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();
                if(o1.getAge() == o2.getAge()){
                    return name1.compareTo(name2);
                }else{
                    return o1.getAge() - o2.getAge();
                }
            }
        });
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wangwu",25);
        t.put(s1,"浙江");
        t.put(s2,"江苏");
        t.put(s3,"山东");
        System.out.println(t);


    }
}
