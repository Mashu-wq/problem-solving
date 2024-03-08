public class invertedPiramid {
    public static void inverted_rotated_half_pyramid(int n){
        for (int i = 1; i <= n; i++){
            //for spaces
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");

            }
            //for stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void inverted_half_pyramid_with_numbers(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n -i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
        inverted_half_pyramid_with_numbers(5);
    }
    
}
