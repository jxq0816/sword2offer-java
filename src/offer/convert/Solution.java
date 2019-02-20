package offer.convert;

public class Solution {
    public static TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode lastNode =null;
        TreeNode headNode=ConvertNode(pRootOfTree, lastNode);
        while (headNode != null && headNode.left != null) {
            headNode = headNode.left;
        }
        return headNode;
    }

    public static TreeNode ConvertNode(TreeNode rootTree, TreeNode lastNode) {
        if (rootTree == null) {
            return null;
        }
        if (rootTree.left != null) {
            lastNode=ConvertNode(rootTree.left, lastNode);
        }
        rootTree.left = lastNode;
        if (lastNode != null) {
            lastNode.right = rootTree;
        }
        lastNode = rootTree;
        if (rootTree.right != null) {
            lastNode=ConvertNode(rootTree.right, lastNode);
        }
        return lastNode;
    }

}