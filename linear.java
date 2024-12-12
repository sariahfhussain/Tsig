import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int size = 0;
        int search;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int t=0;
    
        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++)    
        {
            arr[i] = sc.nextInt();  
        }

        System.out.println("enter the element to be searched: ");
        search = sc.nextInt();
        for(int i= 0; i< arr.length; i++)
        {   
            if(arr[i]== search)
            {   
            
                System.out.println("element "+ search+ " found at position "+ (i+1));
                t= 1;
            }

    

        }

        if(t==0)
        {
            System.out.println("element not found");
        }
    }
    
}
