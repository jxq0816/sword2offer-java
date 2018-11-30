package offer.GetNumberOfK;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(array[i]==k){
                cnt++;
            }
        }
        return cnt;
    }
}