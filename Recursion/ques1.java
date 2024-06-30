package Recursion;

public class ques1 {
    public static void allOccurrences(int arr[], int i, int key){
        //base case
        if (i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurrences(arr, i + 1, key);
        
        


    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        allOccurrences(arr, 0, 2);
        System.out.println();
        
    }
    
}
