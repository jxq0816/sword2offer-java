package offer.RectCover;
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
public class Solution {
    public int RectCover(int target) {
        int rs=0;
        int first=1;
        int second=2;
        if(target<3){
            rs=target;
        }else{
            for(int i=3;i<=target;i++){
                rs=first+second;
                first=second;
                second=rs;
            }
        }
        return rs;
    }
}