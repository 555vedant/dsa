package trees;
// 
// Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
    }
 



public class dfs {
    class Solution {
    // Define a class TreeNode
   

    // Variable to store the diameter of the binary tree
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        // Call the recursive helper method to calculate diameter
        calculateDepth(root);
        return diameter;
    }

    // Recursive helper method to calculate the depth of each node
    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }


        // Recursively calculate the depth of left and right subtrees
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // Update the diameter if necessary
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the current node
        return Math.max(leftDepth, rightDepth) + 1;
       
    }
}
}
public static void main(String[] args) {
    Solution solution = new Solution();
}
 }
