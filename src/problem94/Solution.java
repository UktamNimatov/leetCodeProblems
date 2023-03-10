package problem94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        tree(root, result);
        return result;
    }

    public static void tree(TreeNode root, List<Integer> result) {
        if (root == null) return;
        tree(root.left, result);
        result.add(root.val);
        tree(root.right, result);
    }
}
