package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lonelyNumbers {
    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)){
                list.add(nums.get(i));
            }
            
        }
        if(nums.size() == 1){
            list.add(nums.get(0));
        }
        if(nums.size() > 1){
            if(nums.get(0) + 1 < nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)){
                list.add(nums.get(nums. size() - 1));
            }

        }
        return list;
    }
    
    
}
