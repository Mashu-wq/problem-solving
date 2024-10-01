package SORTING;

import java.util.Arrays;

public class tripletSum {
    public static int countTriplets(int a[],int n, int sum){
        int count = 0;
        Arrays.sort(a);
        for(int i = 0; i < n - 2; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                if(a[i] + a[j] + a[k] >= sum){
                    k--;
                }
                else{
                    count += k - j;
                    j++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int sum = 12;
        int a[] = {5, 1, 3, 4, 7};
        int n = a.length;
        System.out.println(countTriplets(a, n, sum));
    }
    
}
