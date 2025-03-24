package Test4;
import java.util.Date;
public class DateDemo1 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        Date d1 = new Date(0L);
        System.out.println(d1);

        d1.setTime(1000L);
        System.out.println(d1);
    }
}
