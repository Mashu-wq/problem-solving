/*
 * Given two arrays of equal size n and an integer k. The task is to permute both arrays such that sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is to print “Yes” if any such permutation exists, otherwise print “No”.

Examples : 

* Input : a[] = {2, 1, 3}, 
        * b[] = { 7, 8, 9 }, 
        * k = 10. 
Output : Yes
Permutation  a[] = { 1, 2, 3 } and b[] = { 9, 8, 7 } 
satisfied the condition a[i] + b[i] >= K.

Input : a[] = {1, 2, 2, 1}, 
        b[] = { 3, 3, 3, 4 }, 
        k = 5. 
Output : No
 */


package SORTING;

import java.util.*;
import java.util.Collection;
import java.util.Collections;

public class permut_and_sum {
    public static boolean check(int a[], int b[], int n, int k){
        //sort the array in a decreasing order
        Arrays.sort(a, Collections.reverseOrder());
        //increasing order
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            if(a[i] + b[i] < k){
                return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {
        int a[] = {2, 1, 3};
        int b[] = { 7, 8, 9 };
        int k = 10;
        int n = a.length;
        if(check(a, b, n, k)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
