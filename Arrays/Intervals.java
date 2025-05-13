import java.util.*;

public class Intervals 
{
    public int[][] merge(int[][] ar) 
    {
        if (ar.length == 0) return new int[0][0];
        
        Arrays.sort(ar, (a, b) -> a[0] - b[0]);
        
        List<int[]> res = new ArrayList<>();
        res.add(ar[0]);
        
        for (int i = 1; i < ar.length; i++) 
        {
            int[] last = res.get(res.size() - 1);
            if (last[1] >= ar[i][0]) {
                last[1] = Math.max(last[1], ar[i][1]);
            } 
            else 
            {
                res.add(ar[i]);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) 
    {
        Intervals obj = new Intervals();
        
        int[][] ex1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ex2 = {{1, 4}, {4, 5}};
        
        System.out.println(Arrays.deepToString(obj.merge(ex1))); 
        System.out.println(Arrays.deepToString(obj.merge(ex2))); 
    }
}

