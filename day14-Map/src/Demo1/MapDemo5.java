package Demo1;

import java.util.*;

public class MapDemo5 {
    public static void main(String[] args) {

        /*
        *某个班级80名学生，现在需要组成秋游活动
        * 班长提供四个景点一次是A B C D
        * 每个同学只能选择一个景点，统计除最终哪个景点想去的人数最多
        *
        *
         */
        //存储4个景点
        String[] arr = {"A", "B", "C", "D"};
        //储存投票结果
        ArrayList<String> list = new ArrayList<>();

        Random r  = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计
        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            if(hm.containsKey(name)){
                Integer count = hm.get(name);
                count++;
                hm.put(name,count);
            }else{
                hm.put(name,1);
            }
        }
        System.out.println(hm);
        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        //判断哪个景点的次数跟最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()==max){
                System.out.println(entry.getKey());
            }
        }


    }
}
