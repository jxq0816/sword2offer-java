package offer.IsBalanced_Solution;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        boolean rs=false;
        if(root==null){
            rs=true;
        }else{
            int leftDepth=depth(root.left,0);
            int rightDepth=depth(root.right,0);
            if(Math.abs(leftDepth-rightDepth)<=1){
                rs=true;
            }
        }
        return rs;
    }
    public int depth(TreeNode root,int depth){
        if(root==null){
            return depth;
        }
        TreeNode leftChild=root.left;
        TreeNode rightChild=root.right;
        int leftDepth;
        if(leftChild!=null){
            leftDepth=depth(root.left,depth+1);
        }else{
            leftDepth=depth;
        }

        int rightDepth;
        if(rightChild!=null){
            rightDepth=depth(root.right,depth+1);
        }else{
            rightDepth=depth;
        }
        return Math.max(leftDepth,rightDepth);
    }
}
