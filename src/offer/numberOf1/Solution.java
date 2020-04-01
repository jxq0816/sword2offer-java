package offer.numberOf1;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Solution {
    public int NumberOf1(int n) {
        String str=Integer.toBinaryString(n);
        int len=str.length();
        int cnt=0;
        for(int i=0;i<len;i++){
            if('1'==str.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
}