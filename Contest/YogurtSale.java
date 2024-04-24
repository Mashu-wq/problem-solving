package Contest;

import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();  
            int a = scanner.nextInt();  
            int b = scanner.nextInt();  
            
            int minCost = calculateMinCost(n, a, b);
            System.out.println(minCost);
        }
        scanner.close();
    }

    private static int calculateMinCost(int n, int a, int b) {
        
        int pairsCost = (n / 2) * Math.min(2 * a, b);
        
        int oddCost = (n % 2) * a;
        
        return pairsCost + oddCost;
    }
}
