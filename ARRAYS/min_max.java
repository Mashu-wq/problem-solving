package ARRAYS;

import java.util.Scanner;

public class min_max {
    public static int min(int[] a, int n){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    public static int max(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

    }
    int min = min(arr, n);
    int max = max(arr, n);
    System.out.println(min);
    System.out.println(max);
    
    }}
