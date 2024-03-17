package ARRAYS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class findLargestKth {
    //1st approach
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
        
    }
    //2nd approach
    public static int findKthLargest2(int[] nums, int k){
        int left = 0, right = nums.length - 1;
        Random rand = new Random();
        while(true){
            int pivot_index = 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 1; i <= size; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findKthLargest(arr, k);

    }
}
    

