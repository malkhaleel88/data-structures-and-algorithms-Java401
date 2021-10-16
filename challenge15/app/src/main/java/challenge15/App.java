/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge15;

import challenge15.structure.BinarySearchTree;


public class App {

    public static void main(String[] args) {

        /**
         *  Code Challenge 15
         */

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.add(23);
        binarySearchTree.add(8);
        binarySearchTree.add(42);
        binarySearchTree.add(4);
        binarySearchTree.add(16);
        binarySearchTree.add(27);
        binarySearchTree.add(85);

        System.out.println(binarySearchTree);

        System.out.println(binarySearchTree.contains(16));
        System.out.println(binarySearchTree.contains(10));
        System.out.println(binarySearchTree.contains(27));

        System.out.print("Depth First Traversal Pre-order => ");
        System.out.println(binarySearchTree.preOrder());
        System.out.print("Depth First Traversal In-order => ");
        System.out.println(binarySearchTree.inOrder());
        System.out.print("Depth First Traversal Post-order => ");
        System.out.println(binarySearchTree.postOrder());


    }
}
