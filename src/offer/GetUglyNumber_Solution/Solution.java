package offer.GetUglyNumber_Solution;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index==0){
            return 0;
        }
        int[] array=new int[index];
        array[0]=1;
        int nextUglyIndex=1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        while(nextUglyIndex<index){
            int min = 0x7fffffff;
            int mul2=array[multiply2]*2;
            int mul3=array[multiply3]*3;
            int mul5=array[multiply5]*5;
            min=Math.min(min,mul2);
            min=Math.min(min,mul3);
            min=Math.min(min,mul5);
            array[nextUglyIndex] = min;
            while(array[multiply2]*2<=min){
                multiply2++;
            }
            while(array[multiply3]*3<=min){
                multiply3++;
            }
            while(array[multiply5]*5<=min){
                multiply5++;
            }
            nextUglyIndex++;
        }
        return array[index-1];
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int rs=solution.GetUglyNumber_Solution(7);
        System.out.println(rs);
    }
}