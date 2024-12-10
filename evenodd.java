// find the number of even and odd in an int

import java.util.Scanner;
public class evenodd 
{
    public static void main(String args[])
    {
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int even=0, odd=0;
        while(num>0)
        {
            int rem= num%10;
            if(rem%2==0)
            {
                even= even+1;
            }
            else
            {
                odd= odd+1;
            }
            num= num/10;
        }
        System.out.println("Number of even digits: "+even);
        System.out.println("Number of odd digits: "+odd);
        
    }
}
