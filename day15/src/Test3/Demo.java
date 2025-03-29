package Test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //定义集合
        ArrayList<String> list = new ArrayList<>();
        //临时集合
        ArrayList<String> temp = new ArrayList<>();
        //添加数据
        Collections.addAll(list,"范闲","范建","范统","杜子腾","杜琦燕","宋合泛","侯宠膝","朱益样","朱穆玛峰","袁明媛");
        //随机点名
        Random r = new Random();

        int size = list.size();
        for (int j = 0; j < size; j++) {
            int index = r.nextInt(list.size());
            String name = list.remove(index);
            temp.add(name);
            System.out.println(name);
        }



    }
}
