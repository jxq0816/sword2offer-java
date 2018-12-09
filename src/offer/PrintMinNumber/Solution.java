package offer.PrintMinNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int len=numbers.length;
        String[] array=new String[len];
        for(int i=0;i<len;i++){
            String s=String.valueOf(numbers[i]);
            array[i]=s;
        }
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        String rs="";
        for(int i=0;i<len;i++){
            rs+=array[i];
        }
        return rs;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] numbers={3,32,321};
        String rs= solution.PrintMinNumber(numbers);
        System.out.println(rs);
    }
}