package offer.Permutation;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<>();
        if(str.isEmpty()){
            return list;
        }
        Permutation(list,str,0);
        return list;
    }
    void Permutation(ArrayList<String> list, String str, int begin){
        if(begin==(str.length()-1)){
            list.add(str);
        }
        for(int i=0;i<str.length();i++){
            if((i!=begin) && (str.charAt(i) == str.charAt(begin))){
                continue;
            }
        }


    }
}
