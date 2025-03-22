package Test2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list =new ArrayList<>();

        User u1 = new User("heima001","zhangsan","123456");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","321654");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean flag = findById(list, "heima001");
        System.out.println(flag);
    }
    public static boolean findById(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;

    }
}
