import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        //distinct  元素去重，依赖HashCode和equals方法
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三", "张三", "李四", "王五", "赵六", "赵六");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "王五", "齐七", "玖玖");

        //list1.stream().distinct().forEach(s-> System.out.println(s));

        //concat   合并a和b两个流为一个流
        Stream.concat(list1.stream(), list2.stream()).forEach(s-> System.out.println(s));

        //map   转换流中的数据类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周紫若-14","赵敏-13","张强-12","张三丰-100");


        //第一个数据类型表示原本的数据类型
        //第二个数据类型表示要转之后的数据类型
        //apply的形参s：依次表示流里面的每一个数据
        //返回值：表示转换后的数据

        //当map方法执行完毕之后，流上的数据就变成了整数
        //所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数了
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String ageString = arr[1];
//                int age=Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(s-> System.out.println(s));
        list.stream().map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));



    }
}
