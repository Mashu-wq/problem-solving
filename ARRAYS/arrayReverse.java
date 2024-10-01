package ARRAYS;

import java.util.Scanner;

public class arrayReverse {
    //using extra array

    // public static void reversedArrayWithExtraArray(int []arr){
    //     int [] reversedArray = new int[arr.length];
    //     for(int i = 0; i < arr.length; i++){
    //         reversedArray[i] = arr[arr.length - i - 1];
    //     }
    //     System.out.println("Reversed Arrary: ");
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.println(reversedArray[i]);
    //     }
        

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int []arr = new int[n];
    //     for(int i = 0; i < n; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     reversedArrayWithExtraArray(arr);
    // }

    //using loop

    public static void reverseArray(int [] arr, int start, int end){
            int temp;
            while(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

    }
    
    static void printArray(int [] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr, n);
        reverseArray(arr, 0, n);
        System.out.println("Reversed array in \n");
        printArray(arr, n);
    }
    
}
