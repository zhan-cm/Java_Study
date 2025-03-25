package Demo3;

import java.util.Comparator;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        /*
       需求1：
            键：整数表示id
            值：字符串表示商品名称
            要求：按照id的升序排列，按照id的降序排列
         */
        TreeMap<Integer,String> t = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        t.put(1,"水");
        t.put(2,"冰水");
        t.put(3,"热水");
        //自定义排序规则
        System.out.println(t);

    }
}
