package lab19_BinaryTree;

public class BinaryTreeRight extends BinaryTree {

    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        System.out.println(node.value());
        traversalTree(node.left());
        traversalTree(node.right());
    }
}