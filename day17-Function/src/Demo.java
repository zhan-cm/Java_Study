import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Girlfriend girlfriend = new Girlfriend();

        while (true) {
            try {
                System.out.println("请输入女朋友的名字:");
                String name = sc.nextLine();
                girlfriend.setName(name);
                System.out.println("请输入女朋友的年龄:");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                girlfriend.setAge(age);
                System.out.println(girlfriend);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
            } catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
            }
        }


    }
}
