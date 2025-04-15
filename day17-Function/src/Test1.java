import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"张三-23","李四-24","王五-25");

        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array));
    }
}
