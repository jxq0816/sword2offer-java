package offer.reOrderArray;

public class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] array={1,2,3,4,5,6,7};
        solution.reOrderArray(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public void reOrderArray(int [] array) {
        int len=array.length;
        int[] array1=new int[len];
        int[] array2=new int[len];
        int cnt1=0,cnt2=0;
        for(int i=0;i<len;i++){
            if(array[i]%2==1){
                array1[cnt1++]=array[i];
            }else{
                array2[cnt2++]=array[i];
            }
        }
        int index=0;
        for(int i=0;i<cnt1;i++){
            array[index++]=array1[i];
        }
        for(int i=0;i<cnt2;i++) {
            array[index++] = array2[i];
        }
    }
}
