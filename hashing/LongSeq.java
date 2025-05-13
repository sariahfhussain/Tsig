import java.util.*;

public class LongSeq
{
    public int lc(int[] a)
    {
        Set<Integer> s = new HashSet<>();
        for (int n : a) s.add(n);

        int max = 0;
        for (int n : s)
        {
            if (!s.contains(n - 1))
            {
                int c = 1, cur = n;
                while (s.contains(cur + 1))
                {
                    cur++;
                    c++;
                }
                max = Math.max(max, c);
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        LongSeq obj = new LongSeq();
        System.out.println("Longest Consecutive Sequence Length: " + obj.lc(a));
    }
}

