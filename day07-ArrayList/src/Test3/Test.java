package Test3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        find(list);
    }

    public static void find(ArrayList<Phone> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()<3000){
                System.out.println(list.get(i).getBrand()+","+list.get(i).getAge());
            }
        }
    }
}
