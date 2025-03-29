package Test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //班上有n个同学，学生属性：姓名，年龄，性别
        //实现随机名器
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"范闲", "范建", "范统", "杜子腾", "杜琦君","宋合泛","朱偏右", "朱偏左");
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);

    }
}
