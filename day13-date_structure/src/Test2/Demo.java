package Test2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);

        ArrayList<Integer> list1= new ArrayList<>();
        ListUtil.addAll2(list1,1,2,3,4,5,6,7,8,9,0,10);
        System.out.println(list1);
    }

}
