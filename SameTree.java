//https://leetcode.com/problems/same-tree/
//Given the roots of two binary trees p and q, write a function to check if they are the same or not.

class Solution {
     public boolean isSameTree(TreeNode p, TreeNode q) {
   
    if (p == null && q == null) 
    {

    return true;
    }
    if (q == null || p == null) 
    {
        return false;
    }
    if (p.val != q.val) 
    {
        return false;
    }
    return isSameTree(p.right, q.right) &&
            isSameTree(p.left, q.left);
  }
    
}
