package Recursion;
import java.util.Scanner;


public class RecursionBasic {
    public static void IncOrder(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        IncOrder(n - 1);
        System.out.print(n + " ");

    }

    public static void DecOrder(int n){
        if(n == 1){
            System.out.println(n + " ");
            return;
        }
        System.out.print(n + " ");
        DecOrder(n - 1);
    }

    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        int fnm1 = fact(n - 1);
        int f = (n * fnm1);
        return f;
        
    }

    public static int sumOf1stnNumbers(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = sumOf1stnNumbers(n - 1);
        int s = n + Snm1;
        return s;

    }
    public static int fib(int n){
        if (n == 0 | n == 1){
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;  
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static int lastOccurance(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number: ");	
        int n = scanner.nextInt();

        System.out.println("Decreasing Order: ");
        DecOrder(n);
        System.out.println();
        System.out.println("Increasing Order: ");
        IncOrder(n);
        System.out.println();
        System.out.println("Factorial: ");
        System.out.println(fact(n));
        System.out.println();
        System.out.println("Sum of 1st N numbers: ");
        System.out.println(sumOf1stnNumbers(n));
        System.out.println();
        System.out.println("Fibonacci: ");
        System.out.println(fib(n));
        System.out.println();
        System.out.println("Power: ");
        System.out.println(power(2, 3));

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 5, 9, 10};
        System.out.println();
        System.out.println("Is the array sorted? " + isSorted(arr, 0));
        System.out.println();
        System.out.println("First Occurance of the element: " + firstOccurance(arr, 5, 0));
        System.out.println();
        System.out.println("Last Occurance of the element: " + lastOccurance(arr, 5, 0));
    }
}
