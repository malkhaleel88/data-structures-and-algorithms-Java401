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

        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();

        linkedList3.append("1");
        linkedList3.append("2");
        linkedList3.append("3");

        linkedList4.append("4");
        linkedList4.append("5");
        linkedList4.append("6");

        System.out.println(linkedList3.zipLists(linkedList3, linkedList4));

//        LinkedList linkedList1 = new LinkedList();

//        linkedList.append("8");
//        linkedList.append("2");
//        linkedList.append("6");
//        linkedList.append("1");
//        linkedList.append("5");
//        linkedList.append("7");
//
//        linkedList1.append("8");
//        linkedList1.append("2");
//        linkedList1.append("6");
//        linkedList1.append("1");
//        linkedList1.append("5");
//        linkedList1.append("7");
//
//        System.out.println(linkedList);
//        System.out.println(linkedList1);
//
//        System.out.println(linkedList.sort());
//        System.out.println(linkedList.plus(linkedList, linkedList1));

    }
}
