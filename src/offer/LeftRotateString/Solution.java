package offer.LeftRotateString;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()<n){
           return "";
        }
        String s1=str.substring(0,n);
        String s2=str.substring(n,str.length());
        return s2+s1;
    }
}
