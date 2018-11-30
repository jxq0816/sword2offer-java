package offer.FindContinuousSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        List rs=new ArrayList<>();
        for(int i=1;i<=50;i++){
            int s=0;
            for(int j=i;j<=50;j++){
                s+=j;
                if(s==sum){
                    if(j!=i){
                        List list=new ArrayList<>();
                        for(int k=i;k<=j;k++){
                            list.add(k);
                        }
                        rs.add(list);
                    }
                    break;
                }
            }
        }
        return (ArrayList<ArrayList<Integer>>) rs;
    }
}