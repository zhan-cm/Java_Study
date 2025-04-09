import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //单列集合获取Stream流
        //ArrayList<String> list = new ArrayList<>();
        //Collections.addAll(list,"a","b","c","d","e");
//        Stream<String> stream1 = list.stream();
//        //使用终结方法打印一条流水线的所有数据
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //list.stream().forEach(s-> System.out.println(s));


        //双列集合获取Stream流--不能在卷使用Stream流
//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("aaa",111);
//        hm.put("bbb",222);
//        hm.put("ccc",333);
//
//        hm.keySet().stream().forEach(s-> System.out.println(s));
//
//        hm.entrySet().stream().forEach(s-> System.out.println());

        //数组获取Stream流
        //int[] arr = {1,2,3,4,5,6,7,8,9,0};

        //Arrays.stream(arr).forEach(s-> System.out.println(s));

        //一堆零散数据获取Stream流
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));


    }
}
