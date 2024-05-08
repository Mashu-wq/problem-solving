package TwoDArrays;

public class SumOfSecondRowNums {
    public static int sumOfSecondRowNums(int [][] arr){
        int sum = 0;
        for (int j = 0; j < arr.length; j++){
            sum += arr[1][j];

            
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfSecondRowNums(arr));
    }
    
}
