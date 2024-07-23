
import java.util.Arrays;
import java.util.List;

public class AnyMatchExample2 {
    public static void main(String[] args) {

        List<Integer> anyMatch= Arrays.asList(1,2,3,4,5,6,7);

        boolean ex=anyMatch.stream().anyMatch(n->n>6);

        System.out.println(ex);

        boolean allMatch=anyMatch.stream().allMatch(n-> n >5);

        System.out.println(allMatch);
    }
}
