import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        //需求：集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中

        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"张无忌-15","赵敏-16","周芷若-17","张强-18","张三丰-19");
        //3.封装成Student对象并收集到List集合中
        /*List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split("-");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(newList);*/

        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
