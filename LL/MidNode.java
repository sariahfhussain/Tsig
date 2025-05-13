import java.util.*;

class ListNode
{
    int v;
    ListNode n;

    ListNode(int x)
    {
        v = x;
        n = null;
    }
}

public class MidNode
{
    public static ListNode mid(ListNode h)
    {
        ListNode s = h, f = h;

        while (f != null && f.n != null)
        {
            s = s.n;
            f = f.n.n;
        }

        return s;
    }

    public static ListNode build(int[] a)
    {
        if (a.length == 0) return null;

        ListNode h = new ListNode(a[0]);
        ListNode c = h;

        for (int i = 1; i < a.length; i++)
        {
            c.n = new ListNode(a[i]);
            c = c.n;
        }

        return h;
    }

    public static void print(ListNode h)
    {
        while (h != null)
        {
            System.out.print(h.v + " ");
            h = h.n;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of list: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter list elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        ListNode h = build(a);
        ListNode m = mid(h);

        System.out.print("Middle node onward: ");
        print(m);
    }
}

