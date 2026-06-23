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
    private void ans(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        ans(root.left,res);
        res.add(root.val);
        ans(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
            stack.push(curr);
            curr = curr.left;
            }
        curr = stack.pop();
        res.add(curr.val);
        curr = curr.right; 
        }
    return res;
    }
}
