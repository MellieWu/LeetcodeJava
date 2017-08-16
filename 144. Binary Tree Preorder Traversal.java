/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        
        if (root == null) return ans;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            ans.add(temp.val);
            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        }
        
        return ans;
    }
}
