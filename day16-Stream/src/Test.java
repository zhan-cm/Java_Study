import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {


        //ArrayList<Integer> list = new ArrayList<>();
        //Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        //list.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));




        //ArrayList<String> list = new ArrayList<>();
        //Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");
        //Map<String, String> arr1 = list.stream()
                //.filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                //.collect(Collectors.toMap(
                        //s -> s.split(",")[0],
                        //s -> s.split(",")[1]
                //));
        //System.out.println(arr1);


        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();
        Collections.addAll(manList,"蔡坤坤,24","叶齁咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");
        Collections.addAll(womanList,"赵小颖,35","杨颖，36","高元元，43","张天天,31","刘诗,35","杨小幂,33");
        Stream<String> man = manList.stream()
                .filter(s -> ((s.split(",")[0]).length() == 3))
                .limit(2);

        Stream<String> woman = womanList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

//        Stream.concat(man,woman).map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//                String name =s.split(",")[0];
//                int age = Integer.parseInt(s.split(",")[1]);
//                return new Actor(name,age);
//            }
//        }).forEach(s-> System.out.println(s));
        List<Actor> list = Stream.concat(man, woman)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
