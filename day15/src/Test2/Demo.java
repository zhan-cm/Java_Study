package Test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
    //班上有n个学生
    /*
    要求：
        70%概率抽到男生
        30%概率抽到女生

        "范闲","范建","范统","杜子腾",“宋合泛",“侯笼藤","朱益群","朱穆朗玛峰",
        "杜琦燕”,"袁明媛",“李猜”,“田蜜蜜”
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Random r = new Random();
        int index = r.nextInt(list.size());
        ArrayList<String> man = new ArrayList<>();
        Collections.addAll(man,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        ArrayList<String> woman = new ArrayList<>();
        Collections.addAll(woman,"袁明媛", "李猜", "田蜜蜜");
        if(list.get(index)==1){
            int boyindex = r.nextInt(man.size());
            System.out.println(man.get(boyindex));
        }else{
            int girlindex = r.nextInt(woman.size());
            System.out.println(woman.get(girlindex));
        }
    }
}
