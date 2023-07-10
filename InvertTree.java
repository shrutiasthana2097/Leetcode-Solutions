//https://leetcode.com/problems/invert-binary-tree/
//Given the root of a binary tree, invert the tree, and return its root.

class Solution {
    public void invertTreeTwo(TreeNode root) {

        TreeNode TempNode;
        if(root==null)
        {
            return ;
        }
        TempNode = root.left;
        root.left=root.right;
        root.right=TempNode;
        invertTreeTwo(root.left);
        invertTreeTwo(root.right);
        
    } 
    public TreeNode invertTree(TreeNode root) {

        invertTreeTwo(root);
        return root;
        
    } 
     
}
