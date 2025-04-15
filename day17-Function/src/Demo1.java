import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        //需求：创建一个数组，进行倒序排序
        Integer[] arr = {3,5,4,1,6,2};
        //匿名内部类

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });



        //System.out.println(Arrays.toString(arr));
        //lambda表达式简化格式
        //因为第二个参数类型Comparator是一个函数式接口
        //Arrays.sort(arr,( o1,  o2)-> o2-o1);
        //System.out.println(Arrays.toString(arr));


        //方法引用
        //1.引用处需要时函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法的形参需要跟抽象方法的形参和返回值保持一致
        //4.被引用方法需要满足当前需求

        //表示引用Demo1类里面的subtarction方法
        //把这个方法当作抽象方法的方法体
        Arrays.sort(arr,Demo1::subtraction);
        System.out.println(Arrays.toString(arr));


    }
    public static int subtraction(int num1,int num2){
        return num2-num1;
    }
}
