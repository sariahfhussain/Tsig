import java.util.*;

public class XORSubArr
{
    public int countSub(int[] a, int k)
    {
        Map<Integer, Integer> m = new HashMap<>();
        int xr = 0, t = 0;

        for (int i = 0; i < a.length; i++)
        {
            xr ^= a[i];
            if (xr == k) t++;

            int y = xr ^ k;
            t += m.getOrDefault(y, 0);

            m.put(xr, m.getOrDefault(xr, 0) + 1);
        }

        return t;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.print("Enter target XOR value: ");
        int k = sc.nextInt();

        XORSubArr x = new XORSubArr();
        System.out.println("Subarrays with XOR = " + k + ": " + x.countSub(a, k));
    }
}

