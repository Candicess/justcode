package algorithm;

/**
 * Created by huan on 2017/10/19.
 * 二叉树反转
 * Ref: http://blog.devtang.com/2015/06/16/talk-about-tech-interview/
 */
public class ReverseBiTree {

    class TreeNode<T> {
        T val;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode reverse(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = reverse(root.left);
        root.right = reverse(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {

    }
}