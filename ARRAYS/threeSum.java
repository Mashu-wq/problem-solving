package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int target = 0;

        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0;i < nums.length; i++){
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        output.addAll(s);
        return output;
        
        
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(threeSum(arr));
    }
}
