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
//Recursive Approach

class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return ans;
    }
    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        ans.add(node.val);
        inOrder(node.right);
    }
}

//Iterative Approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return ans;
        }
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                root = stack.peek();
                ans.add(root.val);
                stack.pop();
                root = root.right;
            }
        }
        return ans;
    }
}
