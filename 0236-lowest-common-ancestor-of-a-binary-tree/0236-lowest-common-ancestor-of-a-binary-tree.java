class Solution {
    public boolean helper(TreeNode root, TreeNode node) {
        if(root == null) return false;
        if(root == node) return true;
        return helper(root.left, node) || helper(root.right, node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        boolean leftp = helper(root.left, p);
        boolean leftq = helper(root.left, q);
        if(leftp && leftq)
            return lowestCommonAncestor(root.left, p, q);
        if(!leftp && !leftq)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}