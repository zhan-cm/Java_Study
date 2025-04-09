import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","赵六","田七");

        //long count()    统计
        //long count = list.stream().count();
        //System.out.println(count);

        //toArray  收集流中的数据，放在数组中
        //Object[] arr1 = list.stream().toArray();
        //System.out.println(Arrays.toString(arr1));

        //IntFunction的泛型：具体类型的数组
        //apply的形参：流中数据个数，要跟数组的长度保持一致
        //apply的返回值：集体类型的数组
//
//        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
