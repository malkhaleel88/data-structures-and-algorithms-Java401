package challenge15.structure;

import challenge15.data.BinaryTreeNode;
import java.util.ArrayList;


public class BinaryTree<T> {

    protected BinaryTreeNode<T> root;

    /**
     *  Code Challenge 15
     */

    // ====== Depth First Traversal Pre-order Method ====== //

    public ArrayList<T> preOrder() {
        if (isEmpty()) {
            return null;
        }
        ArrayList<T> preOrderList = new ArrayList<>();
        traversePreorder(root, preOrderList);
        return preOrderList;
    }

    private void traversePreorder(BinaryTreeNode<T> root, ArrayList<T> preOrderList) {

        preOrderList.add(root.getData());

        if (root.getLeftNode() != null) {
            traversePreorder(root.getLeftNode(), preOrderList);
        }
        if (root.getRightNode() != null) {
            traversePreorder(root.getRightNode(), preOrderList);
        }
    }

    // ====== Depth First Traversal In-order Method ====== //

    public ArrayList<T> inOrder() {
        if (isEmpty()) {
            return null;
        }
        ArrayList<T> inOrderList = new ArrayList<>();
        traverseInorder(root, inOrderList);
        return inOrderList;
    }

    private void traverseInorder(BinaryTreeNode<T> root, ArrayList<T> inOrderList) {

        if (root.getLeftNode() != null) {
            traverseInorder(root.getLeftNode(), inOrderList);
        }
        inOrderList.add(root.getData());

        if (root.getRightNode() != null) {
            traverseInorder(root.getRightNode(), inOrderList);
        }
    }

    // ====== Depth First Traversal Post-order Method ====== //

    public ArrayList<T> postOrder() {
        if (isEmpty()) {
            return null;
        }
        ArrayList<T> postOrderList = new ArrayList<>();
        traversePostorder(root, postOrderList);
        return postOrderList;
    }

    private void traversePostorder(BinaryTreeNode<T> root, ArrayList<T> postOrderList) {

        if (root.getLeftNode() != null) {
            traversePostorder(root.getLeftNode(), postOrderList);
        }
        if (root.getRightNode() != null) {
            traversePostorder(root.getRightNode(), postOrderList);
        }
        postOrderList.add(root.getData());
    }

    // ===== IsEmpty Method ===== //

    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public String toString() {
        return "BinaryTree { " +
                "root=" + root +
                " }";
    }
}
