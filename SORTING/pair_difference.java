package SORTING;

import java.util.Arrays;

public class pair_difference {
   public static boolean findPair(int a[], int size, int n){
    Arrays.sort(a);
    int l = 0;
    int r = 1;
     n = Math.abs(n);
     while(l <= r && r < size){
        int diff = a[r] - a[l];
        if(diff == n && r != l){
            System.out.println("Pair found: (" + a[l] + ", " + a[r] + ")");
        }
        else if(diff > n){
            l++;
        }
        else{
            r++;
        }
        
     }
     System.out.println("No such pair");
        return false;
   }
    public static void main(String[] args) {
        int a[] = {5, 20, 3, 2, 50, 80};
        int n = 78;
        int size = a.length;
        findPair(a, size, n);
        

    }
    
}
