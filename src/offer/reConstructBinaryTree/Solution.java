package offer.reConstructBinaryTree;

public class Solution {
    //pre:先序 in:中序
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode=new TreeNode(pre[0]);
        //查找根节点在先序遍历数组中的下标
        int rootIndex=0;
        for(int i=0;i<in.length;i++) {
            //中序遍历数组中的第一个位置是根节点
            if(in[i]==pre[0]) {
                rootIndex=i;
            }
        }
        //将先序的遍历结果分成两份，一份是左子树，一份是右子树
        int[] preLeft=new int[rootIndex];
        int[] preRight=new int[pre.length-rootIndex-1];
        for(int i=0;i<rootIndex;i++) {
            preLeft[i]=pre[i+1];
        }
        for(int i=0;i<pre.length-rootIndex-1;i++) {
            preRight[i]=pre[rootIndex+1+i];
        }
        //将中序的遍历的结果分为两份，一份是左子树，一份是右子树
        int[] midLeft=new int[rootIndex];
        int[] midRight=new int[in.length-rootIndex-1];
        for(int i=0;i<rootIndex;i++) {
            midLeft[i]=in[i];
        }
        for(int i=0;i<in.length-rootIndex-1;i++) {
            midRight[i]=in[rootIndex+i+1];
        }
        if(in.length>0&pre.length>0) {
            if(preLeft.length>0) {
                treeNode.left=reConstructBinaryTree(preLeft,midLeft);
            }
            if(preRight.length>0) {
                treeNode.right= reConstructBinaryTree(preRight,midRight);
            }
        }
        return treeNode;
    }
    public void preVisit(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        System.out.print(treeNode.val+",");
        preVisit(treeNode.left);
        preVisit(treeNode.right);
    }
    public void midVisit(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        midVisit(treeNode.left);
        System.out.print(treeNode.val+",");
        midVisit(treeNode.right);
    }
    public static void main(String[] args) {
        //测试
        int[] pre= {1,2,4,7,3,5,6,8};
        int[] in= {4,7,2,1,5,3,8,6};
        Solution solution=new Solution();
        TreeNode treeNode=solution.reConstructBinaryTree(pre,in);
        solution.preVisit(treeNode);
        System.out.println();
        solution.midVisit(treeNode);
        System.out.println();
    }
}