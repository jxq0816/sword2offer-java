package offer.reOrderArray;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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
