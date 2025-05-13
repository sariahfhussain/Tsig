public class SortColors 
{
    public void sortColors(int[] n) 
    {
        int l = 0, m = 0, h = n.length - 1;

        while (m <= h) 
        {
            if (n[m] == 0) 
            {
                int t = n[l];
                n[l] = n[m];
                n[m] = t;
                l++;
                m++;
            } 
            else if (n[m] == 1) 
            {
                m++;
            } 
            else
            {
                int t = n[m];
                n[m] = n[h];
                n[h] = t;
                h--;
            }
        }
    }

    public static void main(String[] args) 
    {
        SortColors obj = new SortColors();
        int[] n = {2, 0, 2, 1, 1, 0, 2, 1, 0, 0};

        obj.sortColors(n);  
        for (int num : n) 
        {   
            System.out.print(num + " ");
        }
    }
}
