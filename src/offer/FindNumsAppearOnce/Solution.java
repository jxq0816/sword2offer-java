package offer.FindNumsAppearOnce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len=array.length;
        Map map=new HashMap();
        for(int i=0;i<len;i++){
            int item = array[i];
            Object obj=map.get(item);
            if(obj==null){
                map.put(item,1);
            }else{
                Integer cnt= (Integer)obj;
                map.put(item,cnt+1);
            }
        }
        List list=new ArrayList<Integer>();
        for(Object key:map.keySet()){
            int cnt= (int) map.get(key);
            if(cnt==1){
                list.add(key);
            }
        }
        num1[0]=(Integer) list.get(0);
        num2[0]=(Integer) list.get(1);
    }
}