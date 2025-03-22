import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        Menu(users);
        Option(list);
    }
    public static void Info() {
        System.out.println("——————————欢迎来到黑马学生管理系统——————————");
        System.out.println("|-----1.添加学生------------------------|");
        System.out.println("|-----2.删除学生------------------------|");
        System.out.println("|-----3.修改学生------------------------|");
        System.out.println("|-----4.查询单个学生---------------------|");
        System.out.println("|-----5.查询所有学生---------------------|");
        System.out.println("|-----6.退出---------------------------|");
        System.out.println("|-----请输入您的选择:--------------------|");
        System.out.println("————————————————————————————————————————");
    }
    public static void addStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        while (true) {
            System.out.print("请输入学生的id：");
            String message_id = sc.next();
            if (findIsReHappend(list, message_id)) {
                System.out.println("该id已被占用，请重新输入");
                continue;
            }
            student.setId(message_id);

            System.out.print("请输入学生的姓名：");
            String message_name = sc.next();
            student.setName(message_name);

            System.out.print("请输入学生的年龄：");
            int message_age = sc.nextInt();
            student.setAge(message_age);

            System.out.print("请输入学生的家庭地址：");
            String message_address = sc.next();
            student.setAddress(message_address);
            list.add(student);
            System.out.println("添加学生成功");
            System.out.println("----------------------------------------");
            Info();
        }


    }
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的学生id：");
        String id = sc.next();
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getId()).equals(id)) {
                list.remove(list.get(i));
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("没有查到指定的学生信息，请重新尝试");
            System.out.println("---------------------------------");
        } else {
            System.out.println("输入成功，已删除该学生信息");
            System.out.println("---------------------------------");
        }
        Info();
    }
    public static void rewriteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改学生的id：");
        String id = sc.next();
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getId()).equals(id)) {
                System.out.print("请输入新的学生姓名：");
                String new_name = sc.next();
                System.out.print("请输入新的学生年龄：");
                int new_age = sc.nextInt();
                System.out.print("请输入新的学生家庭住址：");
                String new_address = sc.next();


                list.get(i).setName(new_name);
                list.get(i).setAge(new_age);
                list.get(i).setAddress(new_address);
                System.out.println("修改成功");
                System.out.println("---------------------------------");
                flag = 1;
            }

        }
        if (flag == 0) {
            System.out.println("没有查到指定的学生信息，请重新尝试");
            System.out.println("---------------------------------");
        }
        Info();
    }
    public static void findStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查询的学生id:");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getId()).equals(id)) {

                System.out.println("该学生的id是：" + list.get(i).getId() + " 姓名是：" + list.get(i).getName() + " 年龄是：" + list.get(i).getAge() + " 家庭地址是：" + list.get(i).getAddress());
                System.out.println("---------------------------------");
            } else {
                System.out.println("没有查到指定的学生信息，请重新尝试");
                System.out.println("---------------------------------");
            }
        }
        Info();
    }
    public static void printAllStudent(ArrayList<Student> list) {
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + "\t\t" + list.get(i).getName() + "\t\t" + list.get(i).getAge() + "\t\t" + list.get(i).getAddress());
        }
        System.out.println("---------------------------------");
        Info();
    }
    public static boolean findIsReHappend(ArrayList<Student> list, String id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public static boolean contains(ArrayList<User> list, String username) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public static void Register(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);

        String name;
        while (true) {
            System.out.println("请用字母+数字的组合，输入3~15位字符作为您的用户名，注：用户名不能是纯数字");
            System.out.print("请输入您的用户名：");
            name = sc.next();
            if (!(usernameCaptcha(name))) {
                System.out.println("用户名格式不满足条件，需要重新输入");
                continue;
            }
            if (contains(users, name)) {
                System.out.println("抱歉,用户" + name + "已存在，请重新输入");
            } else {
                System.out.println("用户名" + name + "可用");
                break;
            }
        }
        String password;
        while (true) {
            System.out.print("请输入您的密码：");
            password = sc.next();
            System.out.println("请再次输入要注册的密码：");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码输入正确");
                break;
            }
        }
        String idnumber;
        while (true) {
            System.out.println("请输入您的身份证号码：");
            idnumber = sc.next();
            if (idCaptcha(idnumber)) {
                System.out.println("身份证号码输入成功");
                break;
            } else {
                System.out.println("身份证输入格式不对，请重新输入：");
                continue;
            }
        }
        String phonenumber;
        while (true) {
            System.out.println("请输入您的手机号码：");
            phonenumber = sc.next();
            if (telephoneNumberCaptcha(phonenumber)) {
                System.out.println("手机号码输入成功");
                break;
            } else {
                System.out.println("手机号输入格式有误，请重新输入：");
                continue;
            }
        }

        User u = new User(name, password, idnumber, phonenumber);
        users.add(u);
        System.out.println("注册成功");
    }
    public static void Login(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);

        int i=0;
        String username = null;
        while (true) {
            System.out.print("请输入您的用户名：");
            username = sc.next();

            if (!(contains(users, username))) {
                System.out.println(username + "未注册，请先注册");
                break;
            }

            String code = generateCaptcha();
            System.out.println("当前验证码为：" + code);
            System.out.print("请输入验证码：");
            String c = sc.next();
            if (!(c.equals(code))) {
                System.out.println("验证码错误，请重新输入");
                continue;
            } else {
                System.out.println("验证码输入正确");
            }


            System.out.print("请输入密码：");
            String password = sc.next();


            //验证用户名和密码是否正确
            int flag=0;
            for (int j = 0; j < users.size(); j++) {
                if (users.get(j).getName().equals(username) && users.get(j).getPassword().equals(password)) {
                    System.out.println("登录成功");
                    return;
                }
            }

            System.out.println("用户名或密码错误");

            if (i == 2) {
                System.out.println("当前账号被冻结");
                break;
            } else {
                System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
            }
            i++;

        }
    }
    public static boolean idCaptcha(String id) {
        int flag = 0;
        if (id.length() != 18) {
            System.out.println("身份证号码必须是十八位的");
            return false;
        }
        char c = id.charAt(0);
        if (c == '0') {
            System.out.println("身份证号码不能以0为开头");
            return false;
        }
        for (int i = 0; i < id.length() - 1; i++) {
            char b = id.charAt(i);
            if (b < '0' || b > '9') {
                flag = 1;
            }
        }
        if (flag == 1) {
            return false;
        }
        char endChar = id.charAt(id.length() - 1);
        if (!((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X'))) {
            return false;
        }

        return true;

    }
    public static boolean usernameCaptcha(String username) {
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("抱歉，用户名长度必须在3~15位之间");
            return false;
        }
        int flag = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }

        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                flag++;
                break;
            }
        }

        return flag > 0;

    }
    public static boolean telephoneNumberCaptcha(String phonenmber) {
        if (phonenmber.length() != 11) {
            return false;
        }
        char c = phonenmber.charAt(0);
        if (c == '0') {
            return false;
        }
        int flag = 0;
        for (int i = 0; i < phonenmber.length(); i++) {
            char b = phonenmber.charAt(i);
            if (b <= '0' && b >= '9') {
                flag = 1;
            }
        }
        if (flag == 1) {
            return false;
        }
        return true;
    }
    public static String generateCaptcha() {
        char[] arr = new char[52];
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char) (97 + i);
            } else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        for (int i = 0; i < 4; i++) {
            int random = r.nextInt(52);
            sb.append(arr[random]);
        }
        int rand = r.nextInt(10);
        sb.append(rand);
        String str = sb.toString();
        //打乱字符串
        char[] arr1 = str.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            int number = r.nextInt(arr1.length);
            char temp1 = arr1[number];
            arr1[number] = arr1[i];
            arr1[i] = temp1;
        }
        str = new String(arr1);
        return str;
    }
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username, idnumber, phonenumber;
        String password;
        while (true) {
            System.out.print("请输入用户名：");
            username = sc.next();
            if (!(contains(list, username))) {
                System.out.println("用户名不存在,未注册");
                break;
            }
            System.out.print("请输入身份证号码：");
            idnumber = sc.next();
            System.out.print("请输入手机号码：");
            phonenumber = sc.next();

            int index = findIndex(list,username);
            User user = list.get(index);
            if(!(user.getIdnumber().equalsIgnoreCase(idnumber)&&user.getPhonenumber().equalsIgnoreCase(phonenumber))){
                System.out.println("身份证号码或手机号码输入有误，不能修改密码");
                return;
            }
            while (true) {
            System.out.print("请输入新的密码：");
            password = sc.next();
            System.out.print("请再次输入新的密码：");
            String againPassword = sc.next();

                if(password.equals(againPassword)){
                    System.out.println("两次密码一致");
                    break;
                }else{
                    System.out.println("两次密码不一致，需要重新输入");
                    continue;
                }
            }

            //修改密码
            user.setPassword(password);
            System.out.println("密码修改成功");
        }

    }
    public static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(username)) {
                return i;
            }
        }
        return -1;
    }
    public static void Option(ArrayList<Student> list){
        while (true) {
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            if (option < 1 || option > 6) {
                System.out.println("无效选择，请重新输入");
                Info();
                continue;
            } else if (option == 6) {
                System.out.println("感谢使用学生管理系统,欢迎下次使用");
            } else {
                switch (option) {
                    case 1:
                        addStudent(list);
                        break;
                    case 2:
                        deleteStudent(list);
                        break;
                    case 3:
                        rewriteStudent(list);
                        break;
                    case 4:
                        findStudent(list);
                        break;
                    case 5:
                        printAllStudent(list);
                        break;
                }
            }
        }
    }
    public static void Menu(ArrayList<User> users){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("|         欢迎来到学生管理系统          |");
            System.out.println("|  请选择操作 1.登录  2.注册  3.忘记密码 |");
            System.out.println("------------------------------------");
            int op = sc.nextInt();
            int flag = 0;
            if (op < 1 || op > 4) {
                System.out.println("无效选择，请重新输入");
                continue;
            } else {
                switch (op) {
                    case 1:
                        Login(users);
                        break;
                    case 2:
                        Register(users);
                        break;
                    case 3:
                        forgetPassword(users);
                        break;
                    case 4: {
                        System.out.println("谢谢使用，再见");
                        System.exit(0);
                    }
                }
            }

        }
    }
}
