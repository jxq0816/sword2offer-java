package offer.FindFirstCommonNode;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1=0;
        int len2=0;
        ListNode pH1 = pHead1;
        ListNode pH2 = pHead2;
        while(pH1!=null){
            pH1=pH1.next;
            len1++;
        }
        while(pH2!=null){
            pH2=pH2.next;
            len2++;
        }
        if(len1>len2){
            int dis=len1-len2;
            int j=0;
            while(j<dis){
                pHead1=pHead1.next;
                j++;
            }
        }else if(len2>len1){
            int dis=len2-len1;
            int k=0;
            while(k<dis){
                pHead2=pHead2.next;
                k++;
            }
        }
        ListNode rs=pHead1;
        while(pHead1!=pHead2){
            rs=rs.next;
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return rs;
    }
}
