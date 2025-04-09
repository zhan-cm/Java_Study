import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        //collection(Collector collector)
        // 收集流中的数据，放到集合中（List,Map,Set）
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-23","李四-男-24","王五-女-25","赵六-男-26","田七-女-27");


        //收集List集合当中
        //需求：
        //把所有男性收集
        List<String> newlist = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist);

        //收集Set集合当中
        //需求：
        //把所有男性收集
        Set<String> newSet = list.stream()
                .filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newSet);

        //收集Set集合当中
        //需求：
        //把所有男性收集
//        Map<String, Integer> newMap = list.stream()
//                .filter(s -> "男".equals(s.split("-")[1]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    /*
//                      toMap:    参数一表示键的生成规则
//                                参数二表示值的生成规则
//
//                            参数一：
//                                Function泛型一:表示流中每一个数据的类型
//                                        泛型二：表示Map集合中的键的数据类型
//
//                                方法apply形参：依次表示流里面的每一个数据
//                                            方法体：生成键的代码
//                                            返回值：已经生成的键
//
//                            参数二：
//                                Function泛型一:表示流中每一个数据的类型
//                                        泛型二：表示Map集合中的值的数据类型
//
//                                方法apply形参：依次表示流里面的每一个数据
//                                            方法体：生成值的代码
//                                            返回值：已经生成的值
//                     */
//
//                                              @Override
//                                              public String apply(String s) {
//                                                  return s.split("-")[0];
//                                              }
//                                          },
//                        new Function<String, Integer>() {
//                            @Override
//                            public Integer apply(String s) {
//                                return Integer.parseInt(s.split("-")[2]);
//                            }
//                        }));

        //System.out.println(newMap);
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(newMap);
    }
}
