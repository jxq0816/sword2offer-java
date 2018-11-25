package offer.NumberOf1Between1AndN_Solution;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            String s=String.valueOf(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}