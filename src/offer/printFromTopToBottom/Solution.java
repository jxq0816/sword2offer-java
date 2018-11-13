package offer.printFromTopToBottom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        Queue queue = new LinkedList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            TreeNode node = (TreeNode) queue.remove();
            list.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return list;
    }
}
