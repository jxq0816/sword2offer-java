package offer.min;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int min=0x7fffffff;
        int size=array.length;
        if(size==0){
            return 0;
        }
        for(int i=size-1;i>=0;i--){
            min=Math.min(min,array[i]);
            if(array[i]<array[i-1]){
                break;
            }
        }
        return min;
    }
}
