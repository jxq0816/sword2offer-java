package offer.RectCover;

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