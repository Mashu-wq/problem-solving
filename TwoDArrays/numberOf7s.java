package TwoDArrays;

public class numberOf7s {
    public static int printNumberOf7s(int [][] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i][j] == 7){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printNumberOf7s(arr));
    }
    
}
