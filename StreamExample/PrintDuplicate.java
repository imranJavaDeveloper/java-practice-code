import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicate {

    public List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> store = new HashSet<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (store.contains(current)) {
                output.add(current);
            } else {
                store.add(current);
            }
        }
        return output;  
    }
    public static void main(String[] args) {
        
        // print dublicate value
        
    }
    
}
