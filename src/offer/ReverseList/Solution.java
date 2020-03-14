package offer.ReverseList;

public class Solution {
//    public ListNode ReverseList(ListNode head) {
//        if(head== null){
//            return null;
//        }
//        ListNode reverseHead = null;
//        // 指针1：当前节点
//        ListNode currentNode = head;
//        // 指针2：当前节点的前一个节点
//        ListNode prevNode = null;
//        while(currentNode != null){
//            // 指针3：当前节点的后一个节点
//            ListNode nextNode = currentNode.next;
//            if(nextNode == null){
//                reverseHead = currentNode;
//            }
//            // 指针翻转
//            currentNode.next = prevNode;
//            // 将前一个节点指向当前节点
//            prevNode = currentNode;
//            // 将当前节点指向后一个节点
//            currentNode = nextNode;
//        }
//        return reverseHead;
//    }
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newList= ReverseList(head.next);
        head.next.next=head;//翻转指向
        head.next=null;//记得赋值NULL，防止链表错乱
        return newList;
    }
}
