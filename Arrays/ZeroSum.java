import java.util.*;

public class ZeroSum
{
    public int mL(int[] a)
    {
        Map<Integer, Integer> m = new HashMap<>();
        int sum = 0, max = 0;

        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];

            if (sum == 0) max = i + 1;
            else if (m.containsKey(sum))
                max = Math.max(max, i - m.get(sum));
            else
                m.put(sum, i);
        }

        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        ZeroSum z = new ZeroSum();
        System.out.println("Length of largest subarray with 0 sum: " + z.mL(a));
    }
}
