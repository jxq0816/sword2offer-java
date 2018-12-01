package offer.FirstNotRepeatingChar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int len=str.length();
        Map map=new HashMap<>();
        for(int i=0;i<len;i++){
            char item=str.charAt(i);
            if(map.get(item)==null){
                map.put(item,1);
            }else{
                int cnt= (int) map.get(item);
                map.put(item,cnt+1);
            }
        }
        int rs=-1;
        for(int i=0;i<len;i++){
            char item=str.charAt(i);
            int cnt= (int) map.get(item);
            if(cnt==1){
                rs=i;
                break;
            }
        }
        return rs;
    }
}