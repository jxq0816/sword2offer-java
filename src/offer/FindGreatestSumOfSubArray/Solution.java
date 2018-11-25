package offer.FindGreatestSumOfSubArray;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum=0;
        int max=-999999999;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}