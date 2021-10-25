package main.tree;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public TreeNode setLeft(TreeNode node) {
        this.left = node;
        return this.left;
    }

    public TreeNode setRight(TreeNode node) {
        this.right = node;
        return this.right;
    }

    public int getVal() {
        return this.val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
