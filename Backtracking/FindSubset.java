package Backtracking;

public class FindSubset {
    public static void SubsetFind(String str, String ans, int i){

    if(i == str.length()){
        if(ans.length() == 0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
    }


        //Yes choice
        SubsetFind(str, ans + str.charAt(i), i + 1);
        //No choice
        SubsetFind(str, ans, i + 1);

    }
    public static void main(String[] args) {
        String str = "abc";
        SubsetFind(str, "", 0);
        System.out.println();
        
    }
    
}
