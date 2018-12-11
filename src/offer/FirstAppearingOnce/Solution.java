package offer.FirstAppearingOnce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public Map map=new HashMap();
    public List list=new ArrayList();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        Integer cnt= (Integer) map.get(ch);
        if(cnt==null){
            map.put(ch,1);
        }else{
            map.put(ch,cnt+1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char rs='#';
        int size=list.size();
        for(int i=0;i<size;i++){
            char ch= (char) list.get(i);
            if(1 == (Integer) map.get(ch)){
                rs=ch;
                break;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="helloworld";
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            solution.Insert(ch);
        }
        char rs=solution.FirstAppearingOnce();
        System.out.print(rs);
    }
}