package Demo1;

import java.util.*;

public class MapDemo1{
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> m = new HashMap<>();
        m.put("a","b");
        m.put("c","d");
        m.put("e","f");

        m.remove("a");
        System.out.println(m);
        System.out.println(m.containsKey("a"));
        System.out.println(m.containsKey("b"));
        System.out.println(m.containsKey("c"));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        m.clear();
        System.out.println(m);

    }


}
