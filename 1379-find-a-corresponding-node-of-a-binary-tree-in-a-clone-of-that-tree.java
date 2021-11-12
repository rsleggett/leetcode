/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        var answer = find(cloned, target.val);
        return answer;
    }
    
    private TreeNode find(TreeNode root, int searchValue)
    {
        if(root == null)
        {
            return null;
        }
        if (root.val == searchValue)
        {
            return root;
        }
        
        var left = find(root.left, searchValue);
        if(left == null)
        {
            return find(root.right, searchValue);
        }
        return left;
    }
}
