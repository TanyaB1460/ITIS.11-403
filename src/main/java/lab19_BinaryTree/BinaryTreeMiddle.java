package lab19_BinaryTree;

public class BinaryTreeMiddle extends BinaryTree {
    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.left());
        traversalTree(node.right());
        System.out.println(node.value());
    }
}