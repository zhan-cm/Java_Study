import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加数据
        Collections.addAll(list,"张无忌","赵敏","周芷若","张强","张三丰");
        //过滤
        //要求：只要张开头，且满足是3个字
        list.stream().filter(new StringOperation()::StringJudge)
                .forEach(s-> System.out.println(s));

    }
}
