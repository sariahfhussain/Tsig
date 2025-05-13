public class MaxSub 
{
    public int ms(int[] a) {
        int max = a[0], cur = a[0];
        for (int i = 1; i < a.length; i++) {
            cur = Math.max(a[i], cur + a[i]);
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSub m = new MaxSub();
        int[] ex1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] ex2 = {1};
        int[] ex3 = {5, 4, -1, 7, 8};

        System.out.println(m.ms(ex1)); // Output: 6
        System.out.println(m.ms(ex2)); // Output: 1
        System.out.println(m.ms(ex3)); // Output: 23
    }
}

