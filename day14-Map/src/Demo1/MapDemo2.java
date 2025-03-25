package Demo1;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式
        Map<String, String> m = new HashMap<>();
        m.put("a", "b");
        m.put("c", "b");
        m.put("e", "b");

        Set<String> keys = m.keySet();

//        for (String key : keys) {
//            System.out.println(key);
//            System.out.println(m.get(key));
//        }

//
        m.forEach((key,value)-> System.out.println(key+" "+value));

    }
}
