package Demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<Students,String> map = new HashMap<>();

        Students s1 = new Students("zhangsan",23);
        Students s2 = new Students("lisi",24);
        Students s3 = new Students("wangwu",25);
        Students s4 = new Students("wangwu",25);

        map.put(s1,"江苏");
        map.put(s2,"浙江");
        map.put(s3,"福建");
        map.put(s4,"山东");

        Set<Students> keys = map.keySet();
        for (Students key : keys) {
            String value = map.get(key);
            System.out.println(key+" "+value);
        }
        System.out.println("-------------------------");
        Set<Map.Entry<Students, String>> entries = map.entrySet();
        for (Map.Entry<Students, String> entry : entries) {
            Students key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }
        System.out.println("-------------------------");
        map.forEach((students, s)->System.out.println(students+" "+s));


    }
}
