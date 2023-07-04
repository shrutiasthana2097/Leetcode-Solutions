//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//Given the root of a binary tree, return its maximum depth.


class Solution {
    public int maxDepth(TreeNode root) {
        int height=0;
        height=calculateHeight(root);
        return height;
    }

    public int calculateHeight(TreeNode root)
    {
        int height=0;
        if(root==null)
        {
            return 0;
        }
        
        int leftDepth=calculateHeight(root.left);
         int rightDepth=calculateHeight(root.right);
        height=Math.max(leftDepth,rightDepth)+1;
        
        return height;
    }
}
