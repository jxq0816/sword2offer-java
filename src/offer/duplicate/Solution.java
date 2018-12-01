package offer.duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        Map map=new HashMap<>();
        Boolean bool=false;
        for(int i=0;i<length;i++){
            int item=numbers[i];
            Object object = map.get(item);
            if(object==null){
                map.put(item,1);
            }else{
                duplication[0]=item;
                bool=true;
                break;
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] numbers={};
        int[] duplication={-1};
        boolean rs=solution.duplicate(numbers,numbers.length,duplication);
        System.out.println(rs);
    }
}