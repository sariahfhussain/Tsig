import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
    
        System.out.println("Enter the size of array: ");
        int size = 0;
        int m=0;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int a[] = new int[size];
        int t=0;
        

        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++)    
        {
            arr[i] = sc.nextInt();  
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        


        for(int i = 0; i < arr.length-1; i++) {
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

                if(arr[i] != arr[j]) {

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

        
       
        System.out.println("the second largest element is "+a[1]);

    }


    
}
