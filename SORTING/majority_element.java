package SORTING;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Recursion.removeDuplicate;

public class majority_element{
    public static int majorityElement(int a[]){
        int n = a.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: a){
            countMap.put(num, countMap.getOrDefault(countMap, 0) + 1);
            if(countMap.get(num) > n / 2){
                return num;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));
    }
}