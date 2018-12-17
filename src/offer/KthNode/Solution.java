package offer.KthNode;

import java.util.ArrayList;

public class Solution {
    ArrayList list = new ArrayList();

    TreeNode KthNode(TreeNode pRoot, int k) {
        midTravel(pRoot);
        int s = list.size();
        if (k == 0 || k > s)
            return null;
        return (TreeNode) list.get(k - 1);
    }

    public void midTravel(TreeNode node) {
        if (node != null) {
            midTravel(node.left);
            list.add(node);
            midTravel(node.right);
        }
    }
}
