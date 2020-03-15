package offer.printListFromTailToHead;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack s=new Stack();
        if(listNode==null){
            return new ArrayList();
        }
        while (listNode.next != null){
            s.push(listNode);
            listNode=listNode.next;
        }
        s.push(listNode);
        ArrayList list=new ArrayList();
        while (s.isEmpty()==false){
            ListNode node= (ListNode) s.pop();
            list.add(node.val);
        }
        return list;
    }
}