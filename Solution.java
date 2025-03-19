/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(height(root.left), height(root.left));
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //preprocess the 2d array 
        int h = height(root);
        int col = Math.pow(2 , h)+1;
         ArrayList<Integer> array[][]= new ArrayList[h+1][col];
        //fill the side star
        for(int i=0 ; i<h+1; i++){
            for(int j=0 ; j<h-i; j++){
                array[i][j] = new ArrayList<>(List.of(Integer.MAX_VALUE));
            }
        }
        for(int i=0 ; i<h+1 ; i++){
            for(int j=col-1; j>(col/2)-i; j--){
                array[i][j] = new ArrayList<>(List.of(Integer.MAX_VALUE));
            }

        }
        //now just apply bfs now
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        list.add(new ArrayList<>(List.of(root.val)));
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> listx = new ArrayList<>();
            for(int i=0 ; i<size ; i++){
                TreeNode pop = queue.poll();
                listx.add(pop.val);
                if(pop.left !=null){
                    queue.offer(pop.left);
                }
                if(pop.right != null){
                    queue.offer(pop.right);
                }
            }
            list.add(listx);
        }
        for(int i=0 ; i<h+1; i++){
            for(int j=0 ; j<col; j++){
                if(array[i][j].size()>=1){
                    if(array[i][j].get(0) == Integer.MAX_VALUE){
                        continue;
                    }
                    else{
                        array[i][j].add(list.get(i).get(0));
                        if(list.isEmpty()){
                        list.get(i).remove(0);
                        }
                        if(i+1 < array.length && j<array[0].length){
                            array[i][j] = new ArrayList<>(List.of(Integer.MAX_VALUE));
                        }
                    }
                }
            }
        }
        //NOW FINALLY TRAVERSE THE ARRAY COLUMN WISE
        List<List<Integer>> listv = new ArrayList<>(); 
        for(int j=0; j<array[0].length ; j++){
            List<Integer> listy = new ArrayList<>();
            for(int i=0 ; i<array.length ; i++){
                if(array[i][j].size()>=1 && array[i][j].get(0) == Integer.MAX_VALUE){
                    continue;
                  
                }
                else{
                    for(int v=0 ; v<array[i][j].size() ; v++){
                        listy.add(array[i][j].get(v));
                    }
                }

            }
            Collection.sort(listy);
            listv.add(listy);
        }
        return listv;

    }
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution solution = new Solution();
        List<List<Integer>> result = solution.verticalTraversal(root);
        System.out.println(result);
    }
}