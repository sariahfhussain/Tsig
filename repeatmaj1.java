import java.util.Scanner;
public class repeatmaj1{
    public static void main(String[] args) {
        System.out.println("enter size of array");
        int size = 0;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int a[] = new int[size];
        int t = 0;
        int temp=0;

        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {

                    boolean alreadyAdded = false;
                    for(int k = 0; k < t; k++) {
                        if(a[k] == arr[i]) {
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
        }

        if(t == 0) {
            System.out.println("-1");
        } else {
            for(int k = 0; k < t-1; k++) {
                
                    if( a[k]> a[k+1])
                    {
                        temp= a[k];
                        a[k]= a[k+1];
                        a[k+1]= temp;
                    }
                }
            }
            System.out.println("the repeated elements are: \n");
            System.out.print("[");
            for(int k = 0; k < t; k++) {
                System.out.print(a[k]);
                System.out.print("\t");
            }
            System.out.print("]");
        
        sc.close();
    }
}
