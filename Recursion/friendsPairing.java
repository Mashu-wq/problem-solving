package Recursion;

public class friendsPairing {
    public static int pairing(int n){
        if (n == 1 | n == 2){
            return n;
        }
        //single
        int fnm1 = pairing(n - 1);
        //pair
        int fnm2 = pairing(n - 2);
        int pairingWays = (n - 1) * fnm2;

        //total ways
        int totalWays = fnm1 + pairingWays;
        return totalWays;

    }
    public static void main(String[] args) {
        int n = 4;
        int ways = pairing(n);
        System.out.println(ways);
        
    }
    
}
