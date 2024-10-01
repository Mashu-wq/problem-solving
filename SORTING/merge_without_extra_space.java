package SORTING;

import java.util.Arrays;

public class merge_without_extra_space {
    static int a[] = {1, 5, 9, 10, 15, 20};
    static int b[] = {2, 3, 8, 13};
static void merge(int m, int n) {
    int i = 0, j = 0, k = m - 1;
    while(i <= k && j < n){
        if(a[i] < b[j]){
            i++;
        }else{
            int temp = b[j];
            b[j] = a[k];
            a[k] = temp;
            j++;
            k--;
        }
    }
    Arrays.sort(a);
    Arrays.sort(b);
}
    public static void main(String[] args) {
        merge(a.length, b.length);
        System.out.println("After merging \nFirst Array: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(b));
    }
    
}
