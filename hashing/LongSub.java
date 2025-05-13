import java.util.*;

public class LongSub
{
    public int len(String s)
    {
        Map<Character, Integer> m = new HashMap<>();
        int l = 0, r = 0, max = 0;

        while (r < s.length())
        {
            char c = s.charAt(r);
            if (m.containsKey(c))
            {
                l = Math.max(m.get(c) + 1, l);
            }

            m.put(c, r);
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        LongSub obj = new LongSub();
        System.out.println("Longest length = " + obj.len(s));
    }
}

