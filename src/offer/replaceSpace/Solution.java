package offer.replaceSpace;

public class Solution {

    public static String replaceSpace(StringBuffer str) {
        String rs="";
        int len=str.length();
        for(int i=0;i<len;i++){
            String ch=String.valueOf(str.charAt(i));
            if(" ".equals(ch)){
                rs+="%20";
            }else{
                rs+=ch;
            }
        }
        return rs;
    }
    public static void main(String[] args) {
        String rs=replaceSpace(new StringBuffer("We Are Happy"));
        System.out.println(rs);
    }
}
