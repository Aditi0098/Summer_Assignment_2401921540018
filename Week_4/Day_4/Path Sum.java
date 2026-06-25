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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
    Stack<TreeNode> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    stack1.push(root);
    stack2.push(root.val);
    while(!stack1.isEmpty()){
        TreeNode temp = stack1.pop();
        int tempval = stack2.pop();
        if(temp.left == null && temp.right == null && tempval == targetSum)
        return true;
        if(temp.right != null){
            stack1.push(temp.right);
            stack2.push(temp.right.val + tempval);
        }
        if(temp.left != null){
            stack1.push(temp.left);
            stack2.push(temp.left.val + tempval);

        }

    }
    return false;
}
}
