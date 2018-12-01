package offer.TreeDepth;

public class Solution {
    public int TreeDepth(TreeNode root) {
        int d=depthRecursion(root,0);
        return d;
    }
    public  int depthRecursion(TreeNode root,int depth){
        if(root==null){
            return depth;
        }else{
            int left=depthRecursion(root.left,depth+1);
            int right=depthRecursion(root.right,depth+1);
            return Math.max(left,right);
        }
    }
}
