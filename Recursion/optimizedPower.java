package Recursion;

public class optimizedPower {
    public static int powerOptimization(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = powerOptimization(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
       
    }
    public static void main(String[] args) {
        System.out.println(powerOptimization(2, 5));
        
    }
    
}

