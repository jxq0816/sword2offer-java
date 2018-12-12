package offer.deleteDuplication;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map map=new HashMap();

    public void wordCount(ListNode pHead){
        while(pHead!=null){
            int value=pHead.val;
            Integer cnt=(Integer)map.get(value);
            if(cnt==null){
                map.put(value,1);
            }
            if(cnt!=null){
                map.put(value,cnt+1);
            }
            pHead=pHead.next;
        }
    }

    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode newList=null;
        ListNode newHead=null;
        //统计词频
        wordCount(pHead);
        while(pHead!=null){
            int value=pHead.val;
            Integer cnt=(Integer)map.get(value);
            if(cnt==1){
                ListNode node=new ListNode(value);
                if(newList==null){
                    newList=node;
                    newHead=node;
                }else{
                    newList.next=node;
                    newList=newList.next;
                }
            }
            pHead=pHead.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        node1.next=node2;
        ListNode node3=new ListNode(3);
        node2.next=node3;
        ListNode node4=new ListNode(3);
        node3.next=node4;
        ListNode node5=new ListNode(4);
        node4.next=node5;
        ListNode node6=new ListNode(4);
        node5.next=node6;
        ListNode node7=new ListNode(5);
        node6.next=node7;
        node7.next=null;
        Solution solution=new Solution();
        ListNode rs=solution.deleteDuplication(node1);
        while (rs!=null){
            System.out.println(rs.val);
            rs=rs.next;
        }
    }
}
