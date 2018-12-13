package offer.EntryNodeOfLoop;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set set=new HashSet<>();
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode rs=null;
        while(pHead!=null){
            if(set.contains(pHead)){
                rs=pHead;
                break;
            }else{
                set.add(pHead);
            }
            pHead=pHead.next;
        }
        return rs;
    }
}