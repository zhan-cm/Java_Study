import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo6 {
    public static void main(String[] args) {
        //需求：集合中存储一些整数，收集到数组当中
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);
//        Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });

        //System.out.println(Arrays.toString(arr));

        Integer[] arr2 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));

    }
}
