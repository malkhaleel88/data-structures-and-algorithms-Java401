package challenge15.structure;

import challenge15.data.BinaryTreeNode;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {


    /**
     *  Code Challenge 15
     */

    // ====== Binary Search Tree Add Method ====== //

    public void add(T data) {
        if (isEmpty()) {
            root = new BinaryTreeNode<>(data);
        } else {
            insertHelper(data, root);
        }
    }
    private void insertHelper(T data, BinaryTreeNode<T> root) {
        BinaryTreeNode<T> binaryTreeNode = new BinaryTreeNode<>(data);
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(binaryTreeNode);
            } else {
                insertHelper(data, root.getLeftNode());
            }
        } else if(data.compareTo(root.getData()) > 0) {
            if (root.getRightNode() == null) {
                root.setRightNode(binaryTreeNode);
            } else {
                insertHelper(data, root.getRightNode());
            }
        }
    }

    // ====== Binary Search Tree Contains Method ====== //

    public boolean contains(T data){
        BinaryTreeNode<T> binaryNode = root;

        while (binaryNode != null) {
            if(data.compareTo(binaryNode.getData()) > 0)
                binaryNode = binaryNode.getRightNode();
            else if (data.compareTo(binaryNode.getData()) < 0)
                binaryNode = binaryNode.getLeftNode();
            else
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BinarySearchTree { " +
                "root=" + root +
                " }";
    }
}
