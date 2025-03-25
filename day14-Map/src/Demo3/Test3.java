package Demo3;

import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        String str ="aababcabcdabcde";
        TreeMap<Character,Integer> t = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(t.containsKey(c)){
                Integer count = t.get(c);
                count++;
                t.put(c,count);
            }else{
                t.put(c,1);
            }
        }
        //StringBuilder sb = new StringBuilder();
        t.forEach((character, integer) ->
                        System.out.print(" "+character+"("+integer+")")
                );

    }
}
