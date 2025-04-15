import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        //需求：
        //  集合中有以下数字，要求把他们都变成int类型
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        //变成int类型
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));

    }
}
