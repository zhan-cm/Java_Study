package Test1;

public class GameTest {
    public static void main(String[] args){
        //创建第一个角色
        Role r1 = new Role("001",100,'男');
        //创建第二个角色
        Role r2 = new Role("002",100,'男');

        //开始格斗
        while(true){
            r1.attack(r2);
            //判断r2剩余血量
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+" KO了 "+r2.getName());
                break;
            }

            r2.attack(r1);
            //判断r1剩余血量
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+" KO了 "+r1.getName());
                break;
            }
        }
    }
}
