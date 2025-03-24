package Test1;

public class Test1 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));//是String Builder的对象，不是String对象
        //因为equals方法是被s调用的，而s是字符串
        //所以equals要看String类中的
        //字符串中的equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部属性
        //但是如果参数不是字符串，直接返回false
        System.out.println(sb.equals(s));
        //stringbuilder内无equals方法，默认使用父类object内的方法
        //而object方法比较的是两者的地址值
    }
}
