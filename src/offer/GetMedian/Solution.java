package offer.GetMedian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List list=new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Double rs=null;
        int size=list.size();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=(int)list.get(i);
        }
        Arrays.sort(array);
        if(size%2==1){
            int mid= size/2;
            rs=1.0*array[mid];
        }else{
            rs=1.0*(array[size/2]+array[size/2-1])/2;
        }
        return rs;
    }
}
