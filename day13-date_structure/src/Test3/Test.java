package Test3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<lihuaCat> list1 = new ArrayList<>();
        ArrayList<bosoCat> list2 = new ArrayList<>();
        ArrayList<taidiDog> list3 = new ArrayList<>();
        ArrayList<hashiqiDog> list4 = new ArrayList<>();

        lihuaCat lihua = new lihuaCat();
        lihua.setName("小狸花");
        lihua.setAge(3);
        list1.add(lihua);

        bosoCat boso = new bosoCat();
        boso.setName("小波斯");
        boso.setAge(2);
        list2.add(boso);

        taidiDog taidi = new taidiDog();
        taidi.setName("小泰迪");
        taidi.setAge(1);
        list3.add(taidi);

        hashiqiDog hashiqi = new hashiqiDog();
        hashiqi.setName("小哈士奇");
        hashiqi.setAge(4);
        list4.add(hashiqi);

        // 打印每个宠物的信息
        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);

    }
    public static void keepPet(ArrayList<?> list){
        for (Object pet : list) {
            if (pet instanceof Animals) {
                ((Animals) pet).eat();
            }
        }
    }
}
