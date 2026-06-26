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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderindex = new HashMap<>();
        for(int i =0;i<inorder.length;i++)
        inorderindex.put(inorder[i],i);
        return split(preorder,inorderindex,0,0,inorder.length-1);
        
    }
    private TreeNode split(int[] preorder,Map<Integer,Integer>inorderindex,int rootindex,int left,int right){
        TreeNode root = new TreeNode (preorder[rootindex]);
        int mid = inorderindex.get(preorder[rootindex]);
        if(mid>left)
        root.left = split(preorder,inorderindex,rootindex+1,left,mid-1);
        if(mid<right)
        root.right = split(preorder,inorderindex,rootindex + mid- left+ 1,   mid+1, right);
        return root;
    }
}
