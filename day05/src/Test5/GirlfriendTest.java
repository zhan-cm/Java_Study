package Test5;

public class GirlfriendTest {
    public static void main(String[] args){
        //创建一个数组
        Girlfriend[] arr = new Girlfriend[4];

        //创建女朋友对象
        Girlfriend gf1 = new Girlfriend("小诗诗",18,'女',"吃零食");
        Girlfriend gf2 = new Girlfriend("小丹丹",19,'女',"玩游戏");
        Girlfriend gf3 = new Girlfriend("小惠惠",20,'女',"看书");
        Girlfriend gf4 = new Girlfriend("小莉莉",21,'女',"睡觉");

        //把对象添加到数组当中
        arr[0]=gf1;
        arr[1]=gf2;
        arr[2]=gf3;
        arr[3]=gf4;

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Girlfriend girlfriend = arr[i];
            sum+=girlfriend.getAge();
        }

        //平均
        int avg = sum/ arr.length;

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            Girlfriend girlfriend=arr[i];
            if(girlfriend.getAge()<avg){
                System.out.println(girlfriend.getName()+","+girlfriend.getAge()+","+girlfriend.getGender()+","+girlfriend.getHobby());
                count++;
            }

        }

        System.out.println("年龄小于平均值的有"+count+"个");


    }
}
