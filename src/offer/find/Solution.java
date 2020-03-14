package offer.find;

public class Solution {
    public boolean Find(int target, int [][] array) {
        int len=array.length;
        int len2=array[0].length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len2;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
