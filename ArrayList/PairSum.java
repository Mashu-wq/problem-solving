package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean PairOfSum(ArrayList<Integer> arr, int target){

        for(int i = 0; i < arr.size(); i++){
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == target){
                    return true;
                }

            }

        
    }
    return false;
    
}
//Two pointer approach

public static boolean SumOfPain(ArrayList <Integer> list, int target){
    int lp = 0;
    int rp = list.size() - 1;
    while(lp < rp){
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }
        if(list.get(lp) + list.get(rp) < target){
            lp++;
        }
        else{
            rp--;
        }
    }
    return false;
}
public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    int target = 5;
    System.out.println(PairOfSum(list, target));
    System.out.println(SumOfPain(list, target));
    
}
}
