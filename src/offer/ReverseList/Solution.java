package offer.ReverseList;

import java.util.Stack;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head!=null || head.next==null){
            return head;
        }
        ListNode newList= ReverseList(head.next);
        head.next.next=head;//翻转指向
        head.next=null;//记得赋值NULL，防止链表错乱
        return newList;
    }
}
