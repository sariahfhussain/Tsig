import java.util.*;
public class Pascal
{
    public List<List<Integer>> generate(int n)
    {
        List<List<Integer>> tri = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(tri.get(i - 1).get(j - 1) + tri.get(i - 1).get(j));
            }
            tri.add(row);
        }

        return tri;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pascal p = new Pascal();
        System.out.println(p.generate(n));
    }
}
