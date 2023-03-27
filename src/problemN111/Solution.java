package problemN111;


public class Solution {
    public static void main(String[] args) {
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        int leftCount = minDepth(root.left);
        int rightCount = minDepth(root.right);
        return (leftCount == 0 || rightCount == 0) ? 1 : Math.min(leftCount, rightCount) + 1;
    }
}
