/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge05;

import challenge05.structure.LinkedList;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    /**
     *  Code Challenge 05 TEST
     */

    @Test
    void instantiateLinkedList() {
        LinkedList Test = new LinkedList();
        assertNull(Test.head);
    }

    @Test
    void canInsert() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        String expected = " { 100 }  --->  { 50 }  --->  { 20 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        assertEquals("100", Test.head.getData());
    }

    @Test
    void canInsertMultiple() {
        LinkedList Test = new LinkedList();
        Test.insert("10");
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        String expected = " { 100 }  --->  { 50 }  --->  { 20 }  --->  { 10 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    @Test
    void LinkedListIncludes() {
        LinkedList ll = new LinkedList();
        ll.insert("100");
        ll.insert("50");
        ll.insert("20");
        assertTrue(ll.include("50"));
    }

    @Test
    void LinkedListNotIncludes() {
        LinkedList ll = new LinkedList();
        ll.insert("100");
        ll.insert("50");
        ll.insert("20");

        assertFalse(ll.include("30"));
        assertFalse(ll.include("70"));
    }

    @Test
    void includesWorkingFine() {
        LinkedList ll = new LinkedList();
        ll.insert("20");
        ll.insert("50");
        ll.insert("100");

        String expected = " { 100 }  --->  { 50 }  --->  { 20 }  --->  NULL ";
        assertEquals(expected, ll.toString());
    }
    @Test  public void isEmptyTest() {
        LinkedList testList = new LinkedList();
    }

    /**
     *  Code Challenge 06 TEST
     */

    @Test  public void addAtEnd() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("80");
        Test.append("100");
        String expected = " { 80 }  --->  { 50 }  --->  { 20 }  --->  { 100 }  --->  NULL ";

        assertEquals(expected, Test.toString());
    }

    @Test  public void addMultiAtEnd() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("80");
        Test.append("100");
        Test.append("10");
        Test.append("90");
        String expected = " { 80 }  --->  { 50 }  --->  { 20 }  --->  { 100 }  --->  { 10 }  --->  { 90 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    @Test  public void addBefore() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        Test.insertBefore("50","70");
        String expected = " { 100 }  --->  { 70 }  --->  { 50 }  --->  { 20 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    @Test  public void addBeforefirst() {
        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        Test.insertBefore("100","40");
        String expected = " { 40 }  --->  { 100 }  --->  { 50 }  --->  { 20 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    @Test public void addAfter(){

        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        Test.insertAfter("50","30");
        String expected = " { 100 }  --->  { 50 }  --->  { 30 }  --->  { 20 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    @Test public void addAfterlast(){

        LinkedList Test = new LinkedList();
        Test.insert("20");
        Test.insert("50");
        Test.insert("100");
        Test.insertAfter("20","70");
        String expected = " { 100 }  --->  { 50 }  --->  { 20 }  --->  { 70 }  --->  NULL ";
        assertEquals(expected, Test.toString());
    }

    /**
     *  Code Challenge 07 TEST
     */

    @Test
    public void greaterThanLength() {
        LinkedList testList = new LinkedList();
        testList.insert("M");
        testList.insert("O");
        testList.insert("H");
        testList.insert("A");
        assertEquals("Exception", testList.kthFromEnd(5));
    }

    @Test
    public void equalThanLength() {
        LinkedList testList = new LinkedList();
        testList.insert("M");
        testList.insert("O");
        testList.insert("H");
        testList.insert("A");
        assertEquals("Exception", testList.kthFromEnd(4));
    }

    @Test
    public void negativeIndex() {
        LinkedList testList = new LinkedList();
        testList.insert("M");
        testList.insert("O");
        testList.insert("H");
        testList.insert("A");
        assertEquals("Exception", testList.kthFromEnd(-1));
    }

    @Test
    public void size1() {
        LinkedList testList = new LinkedList();
        testList.insert("M");
        assertEquals("Exception", testList.kthFromEnd(1));
    }

    @Test
    public void happyPath() {
        LinkedList testList = new LinkedList();

        testList.insert("H");
        testList.insert("a");
        testList.insert("p");
        testList.insert("p");
        testList.insert("y");
        testList.insert(" ");
        testList.insert("P");
        testList.insert("a");
        testList.insert("t");
        testList.insert("h");

        assertEquals(" ", testList.kthFromEnd(5));
    }

    /**
     *  Code Challenge 08 TEST
     */

    @Test
    public void zipList1(){

        LinkedList testlist = new LinkedList();
        LinkedList testlist1 = new LinkedList();
        testlist.insert("H");
        testlist.insert("a");
        testlist.insert("p");
        testlist1.insert("p");
        testlist1.insert("y");


        assertEquals(" { p }  --->  { y }  --->  { a }  --->  { p }  --->  { H }  --->  NULL " , (testlist.zipLists(testlist, testlist1)).toString());

    }

    @Test
    public void zipList2(){

        LinkedList testlist = new LinkedList();
        LinkedList testlist1 = new LinkedList();
        testlist.insert("H");
        testlist.insert("a");
        testlist1.insert("p");
        testlist1.insert("p");
        testlist1.insert("y");



        assertEquals(" { a }  --->  { y }  --->  { H }  --->  { p }  --->  { p }  --->  NULL " , (testlist.zipLists(testlist, testlist1)).toString());

    }

    @Test
    public void zipBothListEmpty(){

        LinkedList testlist = new LinkedList();
        LinkedList testlist1 = new LinkedList();


        assertNull(testlist.zipLists(testlist, testlist1), "Both Lists Are Empty");

    }

    @Test
    public void zipList2Empty(){

        LinkedList testlist = new LinkedList();
        LinkedList testlist1 = new LinkedList();
        testlist.insert("H");
        testlist.insert("a");
        testlist.insert("p");



        assertEquals(" { p }  --->  { a }  --->  { H }  --->  NULL ", (testlist.zipLists(testlist, testlist1)).toString());

    }


    @Test
    public void zipList1Empty(){

        LinkedList testlist = new LinkedList();
        LinkedList testlist1 = new LinkedList();
        testlist1.insert("p");
        testlist1.insert("y");



        assertEquals(" { y }  --->  { p }  --->  NULL ", (testlist.zipLists(testlist, testlist1)).toString());

    }

}
