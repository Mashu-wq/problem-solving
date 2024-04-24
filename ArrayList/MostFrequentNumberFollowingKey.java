package ArrayList;

import java.util.ArrayList;

public class MostFrequentNumberFollowingKey {

    public static int FrequentNumber(ArrayList<Integer> list, int key){
        int maxCount = 0;
        int mostFrequentTarget = -1;
        for(int i = 0; i < list.size() - 1; i++){

        if(list.get(i) == key){
            int target = list.get(i + 1);
            int currentCount = 0;

            for(int j = 0; j < list.size() - 1; j++){
                if(list.get(j) == key && list.get(j + 1) == target){
                    currentCount++;
                }
            }
            if(currentCount > maxCount){
                maxCount = currentCount;
                mostFrequentTarget = target;
            }
        }

        }
        return mostFrequentTarget;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key = 1;
        int result = FrequentNumber(list, key);
        System.out.println(result);

    }
    
}
