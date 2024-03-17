package Strings;

import java.util.Scanner;

public class subString {
    public static String subStr(String str, int starti, int endi){
        String substr = "";
        for (int i = starti; i < endi; i++){
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int starti = scanner.nextInt();
        int endi = scanner.nextInt();
        System.out.println(subStr(str, starti, endi));
    }
    
}
