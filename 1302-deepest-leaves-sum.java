/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int solution = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int maxDepth = findMaxDepth(root);

        find(root, maxDepth, 0);
        return solution;
    }
    
    public int findMaxDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        return Math.max(findMaxDepth(root.left)+1, findMaxDepth(root.right)+1);
    }
    
    public void find(TreeNode root, int maxLevel, int currentLevel)
    {
        if(root == null)
        {
            return;
        }
        if(currentLevel+1 == maxLevel)
        {
            solution+=root.val;
        }
        find(root.left,maxLevel,currentLevel+1);
        find(root.right,maxLevel,currentLevel+1);
    }
}
