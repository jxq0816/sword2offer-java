package offer.findPath;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode rootLeft=new TreeNode(5);
        rootLeft.left=null;
        rootLeft.right=null;
        root.left=rootLeft;

        TreeNode rootRight=new TreeNode(12);
        root.right=rootRight;
        rootRight.left=null;
        rootRight.right=null;
        Solution solution=new Solution();
        ArrayList<ArrayList<Integer>>rs = solution.FindPath(root,22);
        System.out.print(rs);

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
        if(root!=null){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            rs = visit(root,target,list);
        }
        return rs;
    }
    public ArrayList<ArrayList<Integer>> visit(TreeNode root, int target,ArrayList<Integer> list){
        ArrayList<ArrayList<Integer>> rs = new ArrayList<>();
        if(root.left==null && root.right==null){
            int sum=0;
            for(int i=0;i<list.size();i++){
                Integer item = list.get(i);
                sum+=item;
            }
            if(sum==target){
                rs.add(list);
            }
        }else{
            if(root.left!=null){
                ArrayList<Integer> leftList= (ArrayList<Integer>) list.clone();
                leftList.add(root.left.val);
                ArrayList<ArrayList<Integer>> lists1 =visit(root.left,target,leftList);
                rs.addAll(lists1);
            }
            if(root.right!=null){
                ArrayList<Integer> rightList= (ArrayList<Integer>) list.clone();
                rightList.add(root.right.val);
                ArrayList<ArrayList<Integer>> lists2 =visit(root.right,target,rightList);
                rs.addAll(lists2);
            }
        }
        return rs;
    }
}
