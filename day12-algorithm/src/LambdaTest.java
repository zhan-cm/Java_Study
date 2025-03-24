import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
        String[] arr = {"a","aaaa","aaa","aa"};

        Arrays.sort(arr,(o1,o2)->o1.length()-o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
