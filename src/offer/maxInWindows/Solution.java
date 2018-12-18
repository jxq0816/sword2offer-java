package offer.maxInWindows;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> rs=new ArrayList<>();
        int len=num.length;
        if(len!=0 && size!=0){
            for(int i=0;i<len-size+1;i++){
                int max=0x80000000;
                for(int j=i;j<i+size;j++){
                    if(num[j]>max){
                        max=num[j];
                    }
                }
                rs.add(max);
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] num={2,3,4,2,6,2,5,1};
        Solution solution=new Solution();
        ArrayList<Integer> rs=solution.maxInWindows(num,0);
        for(int i=0;i<rs.size();i++){
            System.out.println(rs.get(i));
        }
    }
}
