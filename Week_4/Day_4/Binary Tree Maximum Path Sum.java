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
    int maxsum = Integer.MIN_VALUE;
    private int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,solve(root.left));
        int right = Math.max(0,solve(root.right));
        int curr = left + right + root.val;
        maxsum = Math.max(maxsum,curr);
        return root.val + Math.max(left,right);

    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;       
    }
}
