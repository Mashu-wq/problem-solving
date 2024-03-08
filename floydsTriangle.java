public class floydsTriangle {
    public static void floydTriangle(int n){
         int number = 1;
        for (int i = 1; i <= n; i++){
            for (int j =1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTriangle(5) ;
    }
    
}
