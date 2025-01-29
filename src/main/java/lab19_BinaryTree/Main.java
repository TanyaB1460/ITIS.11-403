package lab19_BinaryTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[]{5, 6, 7, 4, 2, 3, 4, 1};

        Node root = new Node(arr[0]);
        BinaryTreeLeft binaryTreeLeft = new BinaryTreeLeft();

        for (int i = 1; i < arr.length; i++) {
            binaryTreeLeft.addLeaf(arr[i], root);
        }


        binaryTreeLeft.traversalTree(root);


    }
}