package Set;

import java.io.FilterOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个Set集合的对象
        Set<String> s = new HashSet<>();
        //添加元素
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        s.add("ddd");

        //利用迭代器进行遍历
//        Iterator<String> it = s.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            System.out.println(str);
//        }
        //利用增强for进行遍历
//        for(String str :s){
//            System.out.println(str);
//        }
        //利用lambda表达式进行遍历
        s.forEach(str->System.out.println(str));


    }
}
