package solutions_code;

import java.util.ArrayList;
import java.util.List;

public class _4_验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {
        List<Integer> treeList = new ArrayList<Integer>();
        InOrder(treeList,root);
        for (int i = 1; i < treeList.size(); i++) {
            if (treeList.get(i-1) > treeList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void InOrder(List<Integer> treeList,TreeNode root) {
        if (root == null) {
            return;
        }
        InOrder(treeList,root.left);
        treeList.add(root.val);
        InOrder(treeList,root.right);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
