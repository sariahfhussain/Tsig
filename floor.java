import java.util.Scanner;

public class floor
{
    public static void main(String[] args) {
    
        System.out.println("Enter the size of array: ");
        int size = 0;
        int m=0;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int a[] = new int[size];
        int t=0;
        int k;

        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++)    
        {
            arr[i] = sc.nextInt();  
        }

    
        System.out.println("enter k");
        k = sc.nextInt();

        for(int i=0; i< arr.length; i++ )
        {
            if( arr[i]<k)
            {
                boolean alreadyAdded = false;
                    for(int j = 0; j < t; j++) {
                        if(a[j] == arr[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    
                    
                    if(!alreadyAdded) {
                        a[t] = arr[i];
                        t++;
                    }
            }
        }
        System.out.println(a[1]+ "is floor");

    }
}
