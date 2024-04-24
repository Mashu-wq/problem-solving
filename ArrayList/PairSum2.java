package ArrayList;

import java.util.ArrayList;

public class PairSum2 {

    public static boolean PairSum(ArrayList <Integer> list, int target){
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get(i + 1)){
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while(lp != rp){

            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) > target){
                rp = (n + rp - 1) % n;
            }
            else{
                lp = (lp + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //11 , 15, 6, 8, 9 , 10 - sorted and rotated

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(PairSum(list, 16));
    }
    
}
