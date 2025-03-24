package Problem;

import java.util.Arrays;
import java.util.Comparator;

public class problem1 {
    public static void main(String[] args) {
        //String[] g1 ={"zhangsan","18","160"};
        //String[] g2 ={"lisi","19","165"};
        //String[] g3 ={"wangwu","20","168"};
        girlfriend g1 = new girlfriend("zhangsan",18,160);
        girlfriend g2 = new girlfriend("lisi",18,165);
        girlfriend g3 = new girlfriend("wangwu",20,165);

        girlfriend[] girl = {g1,g2,g3};

        Arrays.sort(girl, (o1,  o2)-> {
                int temp = o1.getAge()-o2.getAge();
                temp = temp ==0 ? o1.getHeight()-o2.getHeight():temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;
                return temp;

        });
        System.out.println(Arrays.toString(girl));

    }


}
class girlfriend{
    private String name;
    private int age;
    private int height;

    public girlfriend() {
    }

    public girlfriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Girlfriend{ name = "+name+",age = "+age+",height ="+height+"}";
    }
}
