package offer.tree;
public class Solution {
    public static void main(String[] args) {
        //测试
        int[] pre= {1,2,4,7,3,5,6,8};
        int[] in= {4,7,2,1,5,3,8,6};
        TreeNode treeNode=reConstructBinaryTree(pre,in);
        System.out.println(treeNode.toString());
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        TreeNode treeNode=new TreeNode(pre[0]);
        //获取根节点在中序遍历数组中是位置
        int RootIndex=0;
        for(int i=0;i<in.length;i++) {
            if(in[i]==pre[0]) {
                RootIndex=i;
            }
        }
        //将先序的遍历结果分成两份，一份是左子树，一份是右子树
        int[] preLeft=new int[RootIndex];
        int[] preRight=new int[pre.length-RootIndex-1];
        for(int i=0;i<RootIndex;i++) {
            preLeft[i]=pre[i+1];
        }
        for(int i=0;i<pre.length-RootIndex-1;i++) {
            preRight[i]=pre[RootIndex+1+i];
        }
        //将中序的遍历的结果分为两份，一份是左子树，一份是右子树
        int[] midLeft=new int[RootIndex];
        int[] midRight=new int[in.length-RootIndex-1];
        for(int i=0;i<RootIndex;i++) {
            midLeft[i]=in[i];
        }
        for(int i=0;i<in.length-RootIndex-1;i++) {
            midRight[i]=in[RootIndex+i+1];
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
}

