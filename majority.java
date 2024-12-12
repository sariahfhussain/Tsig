import java.util.Scanner;

public class majority {
    public static void main(String[] args) {
    
        System.out.println("Enter the size of array: ");
        int size = 0;
        int maj=0;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int t=0;
    
        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++)    
        {
            arr[i] = sc.nextInt();  
        }
        
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j=1; j< arr.length; j++)
            {
                maj= arr[i];
                t++;
            }
            
        }
        if(t==0)
        {
            System.out.println("-1");
        }

        else
        {
            System.out.println("the majority number is: "+maj);
        }
    }
    
    
}
