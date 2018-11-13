package offer.verifySquenceOfBST;

import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) {
        int[] array={4,8,6,12,16,14,10};
        Solution solution=new Solution();
        boolean bool=solution.VerifySquenceOfBST(array);
        System.out.print(bool);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        int mid = sequence[sequence.length-1];
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int i=0;
        for(i=0;i<sequence.length-1;i++){
            int item = sequence[i];
            if(item < mid){
                left.add(item);
            }else{
                break;
            }
        }
        for(int j=i;j<sequence.length-1;j++){
            int item = sequence[j];
            if(item > mid){
                right.add(item);
            }else{
                break;
            }
        }
        int leftSize =left.size();
        int rightSize =right.size();
        if((leftSize+rightSize)!=(sequence.length-1)){
            return false;
        }
        boolean leftFlag=true;
        boolean rightFlag=true;
        if(leftSize>0){
            int[] leftIntArray=transfer(left,leftSize);
            leftFlag = VerifySquenceOfBST(leftIntArray);
        }
        if(rightSize>0){
            int[] rightIntArray=transfer(right,rightSize);
            rightFlag = VerifySquenceOfBST(rightIntArray);
        }
        if(leftFlag && rightFlag){
            return true;
        }else{
            return false;
        }
    }
    public static int[] transfer( ArrayList<Integer> list,int size){
        Integer[] arrayInteger=list.toArray(new Integer[size]);
        int[] arrayInt =new int[size];
        for(int i=0;i<size;i++){
            arrayInt[i]=arrayInteger[i];
        }
        return arrayInt;
    }
}
