package Test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {

 
        //需求2：定义任意两个Date对象，比较一下哪个时间在钱，哪个时间在后
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if(time1>time2){
            System.out.println("时间1在前面。时间后在后面");
        }else if(time1<time2){
            System.out.println("时间1在后面。时间1在前面");
        }
        else{
            System.out.println("时间1和时间2一样");
        }

        String str="2025-03-09 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);

    }

    private static void method() {
        Date d = new Date(0L);
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss EE");
        String s = sdf1.format(d);
        System.out.println(s);
    }
}
