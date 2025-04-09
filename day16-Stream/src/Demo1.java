import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //filter  过滤 把张开头的留下  其他数据过滤不要
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                //如果返回值为true,表示当前数据留下
//                //如果返回值为false，表示当前数据舍弃不要
//
//                return s.startsWith("张");
//            }
//        }).forEach(s->System.out.println(s));
        //list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));

        //limit 获取前面几个元素
        //list.stream().limit(3).forEach(s-> System.out.println(s));
        //skip 跳过前面几个元素
        //list.stream().skip(2).forEach(s-> System.out.println(s));
    }
}
