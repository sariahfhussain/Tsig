public class MissAndRepeat 
{
   
    public static int[] fMR(int[] arr) 
    {
        int n = arr.length;
        int[] freq = new int[n + 1];  

        for (int num : arr) {
            freq[num]++;
        }

        int rep = -1, miss = -1;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                miss = i;
            } else if (freq[i] == 2) {
                rep = i;
            }
        }

        return new int[]{rep, miss};
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {3, 1, 3, 4, 1, 2};
        int[] res1 = fMR(arr1);
        System.out.println("Repeating: " + res1[0] + ", Missing: " + res1[1]);

        int[] arr2 = {4, 3, 6, 2, 1, 1};
        int[] res2 = fMR(arr2);
        System.out.println("Repeating: " + res2[0] + ", Missing: " + res2[1]);
    }


    
}
