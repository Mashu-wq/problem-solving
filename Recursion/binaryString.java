package Recursion;

public class binaryString {
    public static void printBinaryString(int n , int lastIndex, String str){

        //base case
        if ( n == 0 ){
            System.out.println(str);
            return;
        }

        // if (lastIndex == 0){
        //     printBinaryString(n - 1, 0, str+"0");
        //     printBinaryString(n - 1, 1, str+"1");
        // }
        // else{
        //     printBinaryString(n - 1, 0, str + "0");
        // }
        // in optimized way

        printBinaryString(n - 1, 0, str + "0");
        if (lastIndex == 0){
            printBinaryString(n - 1, 1, str + "1");
        }
        

    }
    public static void main(String[] args) {
        int n = 3;
        printBinaryString(n, 0, "");
        
    }
    
}
