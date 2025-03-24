package Test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:01:00";
        String endStr = "2023年11月11日 0:10:00";
        String orderStr = "2023年11月11日 0:11:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start = sdf.parse(startStr);
        Date end = sdf.parse(endStr);
        Date order = sdf.parse(orderStr);

        long startTime = start.getTime();
        long endTime = end.getTime();
        long orderTime = order.getTime();

        if(orderTime>=startTime&&orderTime<=endTime){
            System.out.println("参与秒杀活动成功");
        }else{
            System.out.println("参与秒杀活动失败");
        }
    }
}
