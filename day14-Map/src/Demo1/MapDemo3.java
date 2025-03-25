package Demo1;

import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("a","b");
        m.put("c","b");
        m.put("d","b");
        Set<Map.Entry<String,String>> entries =  m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }
        System.out.println("-------------------------");
        Iterator<Map.Entry<String, String>> t = entries.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }
        System.out.println("-------------------------");
        m.forEach((key,value)->
                System.out.println(key+" "+value));


    }
}
