package Demo2;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        //创建集合
        LinkedHashMap<String,Integer> Ihm = new LinkedHashMap<>();

        Ihm.put("A",1);
        //]Ihm.put("A",2);
        Ihm.put("C",1);
        Ihm.put("D",1);
        System.out.println(Ihm);
    }
}
