import java.util.Scanner;

class Stack
{
    int[] arr;
    int top;
    int MAX;

    Stack(int size)
    {
        MAX = size;
        arr = new int[MAX];
        top = -1;
    }

    void push(int x)
    {
        if (top == MAX - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[++top] = x;
            System.out.println(x + " pushed to stack");
        }
    }

    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int x = arr[top--];
            return x;
        }
    }

    int peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return arr[top];
        }
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    boolean isFull()
    {
        return top == MAX - 1;
    }
}

public class StackUsingArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        while (true)
        {
            System.out.println("\nWelcome to Stakc");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Exit");
            System.out.println("enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1)
                    {
                        System.out.println(poppedElement + " popped from stack");
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1)
                    {
                        System.out.println("Top element is " + topElement);
                    }
                    break;
                case 4:
                    if (stack.isEmpty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if (stack.isFull())
                    {
                        System.out.println("Stack is full");
                    }
                    else
                    {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
