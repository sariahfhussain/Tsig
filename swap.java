public class swap 
{ 
    public static void main(String args[])
    {
        int a= 1;
        int b= 2;
        System.out.println("Before swapping a= "+a+" b= "+b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping a= "+a+" b= "+b);
    }
    
}
