package offer.MoreThanHalfNum_Solution;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        Map map=new HashMap();
        for(int i=0;i<len;i++){
            int a=array[i];
            if(map.get(a)==null){
                map.put(a,1);
            }else{
                int cnt= (int) map.get(a);
                map.put(a,cnt+1);
            }
        }
        Integer rs=0;
        for(Object key : map.keySet()){
            Integer v= (int) map.get(key);
            if(v>len/2){
                rs=(Integer)key;
            }
        }
        return rs;
    }
}