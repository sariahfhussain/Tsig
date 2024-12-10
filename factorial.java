import java.util.Scanner;
public class factorial
{
    public static void main(String args[])
    {
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int fact=1;

        if(num==0)
        {
            System.out.println("Factorial of 0 is 1");
        }

        else
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}