package ARRAYS;

import java.util.Scanner;

public class buyAndSellStock {
    public static int maxProfit(int[] prices){
        int buy = Integer.MAX_VALUE, sell = 0;
        for(int i = 0; i < prices.length; i++){
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;

    }
    //Another rules
    public static int MaxProfit(int[] price){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for (int i = 0; i < price.length; i++){
            if (buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
}
