//https://leetcode.com/problems/root-equals-sum-of-children/
//Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.

class Solution {
    public boolean checkTree(TreeNode root) {

            boolean result = (root.val == root.left.val+root.right.val) ? true : false;

            return result;       
    }
}
