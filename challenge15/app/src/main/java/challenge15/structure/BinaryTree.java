package challenge15.structure;

import challenge15.data.BinaryTreeNode;
import java.util.ArrayList;


public class BinaryTree<T extends Comparable<T>> {

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

    /**
     *  Code Challenge 16
     */

    // ===== treeMax Method ===== //

    public int treeMax(){
        if (isEmpty()) {
            return 0;
        }
        int maxValue = 0;
        ArrayList<T> findMax = preOrder();
        for (int i = 0; i < findMax.size(); i++) {
            if(Integer.parseInt(findMax.get(i) + "") > maxValue){
                maxValue = Integer.parseInt(findMax.get(i) + "");
            }
        }
        return  maxValue;
    }

    // ===== IsEmpty Method ===== //

    public boolean isEmpty() {
        return root == null;
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<T> root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "BinaryTree { " +
                "root=" + root +
                " }";
    }
}
