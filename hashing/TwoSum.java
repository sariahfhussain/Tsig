import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; 
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum ();
     
        int[] ex1 = {3, 4, 5 ,1, 2, 5};
        int[] ex2 = {3, 2,1 ,6};
        int[] ex3 = {4, 2, 1, 0};
        
        System.out.println(Arrays.toString(obj.twoSum(ex1, 7)));  
        System.out.println(Arrays.toString(obj.twoSum(ex2, 5)));  
        System.out.println(Arrays.toString(obj.twoSum(ex3, 1)));  
    }
}