//https://leetcode.com/problems/symmetric-tree/
//Given the root of a binary tree, check whether it is a mirror of itself.

class Solution {
    public boolean isSymmetric(TreeNode root) {
        boolean result = isSymmetrical(root, root);
        return result;
    }
    public boolean isSymmetrical(TreeNode node1, TreeNode node2 ) {
        if(node1==null&&node1==null)
        return true;

        if(node1==null || node2==null)
        return false;

        
        return (node1.val==node2.val) && isSymmetrical(node1.left,node2.right) && isSymmetrical(node1.right,node2.left);

       
    }
}
