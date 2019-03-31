package offer.multiply;

public class Solution {

    public int[] multiply(int[] A) {
        int len=A.length;
        int[] B=new int[len];
        for(int i=0;i<len;i++){
            B[i]=1;
            for(int j=0;j<i;j++){
                B[i]*=A[j];
            }
            for(int j=i+1;j<len;j++){
                B[i]*=A[j];
            }
        }
        return B;
    }

}
