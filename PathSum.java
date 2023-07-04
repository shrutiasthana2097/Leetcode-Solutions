//https://leetcode.com/problems/path-sum/
//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        else{
            return hasPathSum (root, targetSum, root.val);
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum, int currentSum){
        System.out.println(currentSum);
        if(root == null)
        {
            return false;
        }
        else if((root.left == null && root.right == null) 
        && (targetSum==currentSum))
        {
            return true;
        }

        int leftSum = 0;
        if(root.left!=null){
            leftSum+=root.left.val;
        }
        int rightSum = 0;
        if(root.right!=null){
            rightSum+=root.right.val;
        }
        
        return hasPathSum(root.left,targetSum,currentSum+leftSum)
        || hasPathSum(root.right,targetSum,currentSum+rightSum) ;
    }
}
