package offer.FindKthToTail;

import java.util.Stack;
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack=new Stack();
        ListNode rs = null;
        if(k==0){
            rs=null;
        }else if(head!=null){
            int cnt=0;
            while(head!=null){
                stack.push(head);
                head=head.next;
                cnt++;
            }
            if(cnt>=k) {
                int i = 1;
                while (i < k) {
                    i++;
                    stack.pop();
                }
                rs = stack.pop();
            }else{
                rs = null;
            }
        }
        return rs;
    }
}