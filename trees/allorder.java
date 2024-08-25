package trees;

public /**
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
   public TreeNode sortedArrayToBST(int[] nums) {
       if (nums == null || nums.length == 0) {
           return null;
       }
       return constructBST(nums, 0, nums.length - 1);
   }
   
   private TreeNode constructBST(int[] nums, int start, int end) {
       if (start > end) {
           return null;
       }
                                                                                
       int mid = start + (end - start) / 2;
       TreeNode root = new TreeNode(nums[mid]);
       
       root.left = constructBST(nums, start, mid - 1);
       root.right = constructBST(nums, mid + 1, end);
       
       
       return root;
   }

   // Preorder Traversal
   public void preorder(TreeNode root) {
       if (root != null) {
           System.out.print(root.val + " ");
           preorder(root.left);
           preorder(root.right);
       }
   }

   // Inorder Traversal
   public void inorder(TreeNode root) {
       if (root != null) {
           inorder(root.left);
           System.out.print(root.val + " ");
           inorder(root.right);
       }
   }

   // Postorder Traversal
   public void postorder(TreeNode root) {
       if (root != null) {
           postorder(root.left);
           postorder(root.right);
           System.out.print(root.val + " ");
       }
   }

   // Example usage:
   public static void main(String[] args) {
       int[] nums = {1, 2, 3, 4, 5, 6, 7};
       Solution solution = new Solution();
       TreeNode root = solution.sortedArrayToBST(nums);

       System.out.println("Preorder Traversal:");
       solution.preorder(root); // Output: 4 2 1 3 6 5 7
       System.out.println("\nInorder Traversal:");
       solution.inorder(root); // Output: 1 2 3 4 5 6 7
       System.out.println("\nPostorder Traversal:");
       solution.postorder(root); // Output: 1 3 2 5 7 6 4
   }
}

