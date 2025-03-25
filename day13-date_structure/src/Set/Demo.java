package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<String> ts  = new TreeSet<>(( o1,  o2)-> {
                int i = o1.length()-o2.length();
                return i==0?o1.compareTo(o2):i;

            });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }
}
