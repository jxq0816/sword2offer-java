package offer.GetUglyNumber_Solution;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        int cnt=0;
        int i=0;
        do{
            i++;
            int j=i;
            boolean isUglyNumber=true;
            while(j!=1&&j!=2&&j!=3&&j!=5){
                int k=j;
                if(j%2==0){
                    j=j/2;
                }
                if(j%3==0){
                    j=j/3;
                }
                if(j%5==0){
                    j=j/5;
                }
                if(j==k){
                    isUglyNumber=false;
                    break;
                }
            }
            if(isUglyNumber){
                cnt++;
            }
        }while(cnt!=index);
        return i;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int rs=solution.GetUglyNumber_Solution(7);
        System.out.println(rs);
    }
}