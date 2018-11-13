package offer.isPopOrder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int len=pushA.length;
        Stack stack=new Stack();
        Queue queue=new LinkedList<Integer>();
        for(int i=0;i<len;i++){
            queue.add(popA[i]);
        }
        for(int i=0;i<len;i++){
            int element=pushA[i];
            stack.push(element);
            if(queue.peek()==stack.peek()){
                queue.remove();
                stack.pop();
            }
        }
        Boolean flag=true;
        while(!queue.isEmpty()){
            if(queue.peek()==stack.peek()){
                queue.remove();
                stack.pop();
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] push={1,2,3,4,5};
        int[] pop={4,5,3,2,1};
        Solution solution=new Solution();
        boolean bool=solution.IsPopOrder(push,pop);
        System.out.print(bool);
    }
}
