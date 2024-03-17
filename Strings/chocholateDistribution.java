package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class chocholateDistribution {
    public static int Distribution(int arr[], int m){
        //check base case
        if (arr.length == 0 || m == 0){
            return 0;
        }
        //sort the array to simplify calculation
        Arrays.sort(arr);
        if (arr.length - 1 < m){
            //invalid input
            return -1;
        }
        //initialize minimum difference to the maximum possible integer value
        int min_diff = Integer.MAX_VALUE;
        //iterate through the array to find the minimum difference
        for (int i = 0; i < arr.length; i++){
            int nextWindow = i + m - 1;
            if (nextWindow >= arr.length){
                break;
            }
            int diff = arr[nextWindow] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;      

    }
    public static void main(String[] args) {
        int m = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = Distribution(arr, m);
        if (result != -1){
            System.out.println("Minimum difference is: " + result);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
