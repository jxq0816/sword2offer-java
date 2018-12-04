package offer.ReverseSentence;

public class Solution {
    public String ReverseSentence(String str) {
        String[] array=str.split(" ");
        int len=array.length;
        if(len<=1){
            return str;
        }
        String rs="";
        for(int i=len-1;i>=0;i--){
            rs+=array[i];
            if(i!=0){
                rs+=" ";
            }
        }
        return rs;
    }
}
