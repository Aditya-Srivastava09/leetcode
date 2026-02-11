class Solution {

    long sum = 0;
    long max = 0;

    public int maxProduct(TreeNode root) {
        totalSum(root);
        subtree(root);
        return (int)(max % 1000000007);
    }

    public void totalSum(TreeNode root) {
        if (root == null) return;
        totalSum(root.left);
        sum += root.val;
        totalSum(root.right);
    }

    public long subtree(TreeNode root) {
        if (root == null) return 0;

        long left = subtree(root.left);
        long right = subtree(root.right);

        long curr = left + right + root.val;

        max = Math.max(max, curr * (sum - curr));

        return curr;
    }
}

