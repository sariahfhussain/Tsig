import java.util.*;

public class SumFour
{
    public List<List<Integer>> fs(int[] nums, int target)
    {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 3; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++)
            {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1, r = nums.length - 1;

                while (l < r)
                {
                    long sum = nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum == target)
                    {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++;
                        r--;
                    }
                    else if (sum < target)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        SumFour obj = new SumFour();

        int[] ex1 = {1, 0, -1, 0, -2, 2};
        int[] ex2 = {2, 2, 2, 2, 2};

        System.out.println(obj.fs(ex1, 0));  
        System.out.println(obj.fs(ex2, 8));  
    }
}
