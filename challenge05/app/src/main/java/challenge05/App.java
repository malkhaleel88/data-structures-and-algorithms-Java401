/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge05;

import challenge05.structure.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert("M");
        linkedList.insert("O");
        linkedList.insert("H");
        linkedList.insert("A");
        System.out.println(linkedList);

        linkedList.append("ABC");
        System.out.println(linkedList);

        System.out.println(linkedList.include("M"));
        System.out.println(linkedList.include("N"));

        linkedList.insertBefore("D","K");
        System.out.println(linkedList);

        linkedList.insertBefore("A","K");
        System.out.println(linkedList);

        linkedList.insertAfter("A","E");
        System.out.println(linkedList);

        linkedList.insertAfter("ABC","Z");
        System.out.println(linkedList);

        System.out.println(linkedList.kthFromEnd(8));
        System.out.println(linkedList.kthFromEnd(5));
        System.out.println(linkedList.kthFromEnd(-2));
    }
}
