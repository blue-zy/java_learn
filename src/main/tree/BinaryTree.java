package main.tree;

import jdk.nashorn.internal.ir.BinaryNode;

import java.util.*;

public class BinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode nodeLeft1 = root.setLeft(new TreeNode(7));
        TreeNode nodeRight1 = root.setRight(new TreeNode(5));
        TreeNode nodeLeft11 = nodeLeft1.setLeft(new TreeNode(2));
        TreeNode nodeLeft12 = nodeLeft1.setRight(new TreeNode(6));
        nodeLeft12.setLeft(new TreeNode(5));
        nodeLeft12.setRight(new TreeNode(11));
        TreeNode nodeRight12 = nodeRight1.setRight(new TreeNode(9));
        nodeRight12.setLeft(new TreeNode(4));
        LevOrder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        MidOrder(root);
        System.out.println();
        PosOrder(root);
    }

    // 先序遍历
    public static void PreOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                System.out.print(node.getVal()+" ");
                stack.push(node);
                node = node.getLeft();
            }
            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                node = pop.getRight();
            }
        }
    }

    // 中序遍历
    public static void MidOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                System.out.print(pop.getVal()+" ");
                node = pop.getRight();
            }
        }
    }

    // 后续遍历
    public static void PosOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode lastVisitedNode = null;
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                if (pop.getRight() == null || pop.getRight() == lastVisitedNode) {
                    lastVisitedNode = pop;
                    System.out.print(pop.getVal() + " ");
                } else {
                    node = pop.getRight();
                    stack.push(pop);
                }
            }
        }
    }

    // 层序遍历
    public static void LevOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            System.out.print(poll.getVal()+" ");
            if (poll.getLeft() != null) {
                queue.offer(poll.getLeft());
            }
            if (poll.getRight() != null) {
                queue.offer(poll.getRight());
            }
        }
    }
}
