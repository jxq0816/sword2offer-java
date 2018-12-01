package offer.FindNumbersWithSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int min=0x7fffffff;
        int a=0;
        int b=0;
        Map map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],1);
        }
        for(int i=0;i<array.length;i++){
            int v= array[i];
            int dis=sum-v;
            if(map.get(dis)!=null){
                int rs = v * dis;
                if(min>rs){
                    min = rs;
                    a=v;
                    b=dis;
                }
            }
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(min!=0x7fffffff){
            arrayList.add(a);
            arrayList.add(b);
        }
        return arrayList;
    }
}
