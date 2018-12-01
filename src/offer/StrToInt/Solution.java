package offer.StrToInt;

public class Solution {
    public int StrToInt(String str) {
        int rs=1;
        try {
            if(str.startsWith("+")){
                rs=trans(str.substring(1,str.length()));
            }else if(str.startsWith("-")){
                rs=-1*trans(str.substring(1,str.length()));
            }else {
                rs=trans(str);
            }
        }catch (Exception e){
            rs=0;
        }
        return rs;
    }
    public int trans(String str){
        int rs=0;
        int len=str.length();
        for(int i=0,j=len-1;i<len;i++,j--){
            int p= (int)Math.pow(10,j);
            int w = Integer.valueOf(String.valueOf(str.charAt(i)));
            int n = p*w;
            rs+=n;
        }
        return rs;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int rs=solution.StrToInt("+123");
        System.out.println(rs);
    }
}
