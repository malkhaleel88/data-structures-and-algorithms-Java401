package challenge05.structure;

import challenge05.data.LinkedListNode;

public class LinkedList {

    public LinkedListNode head;
    int size;

    public int getSize() {
        return size;
    }

    /**
     * Code Challenge 05
     */

    public void insert(String data) {
        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
        } else {
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public boolean include(String data) {
        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
        } else {
            LinkedListNode current = head;

            while (current != null) {
                if (current.getData() == data) {
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String printing = "";
        if (head == null) {
            System.out.println("THE LIST IS EMPTY");
        } else {
            LinkedListNode current = head;
            while (current != null) {
                printing = printing + " { " + current.getData() + " } " + " ---> ";
                current = current.getNext();
            }
            printing = printing + " NULL ";
        }
        return printing;
    }

    /**
     * Code Challenge 06
     */

    public void append(String data) {
        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
        } else {
            LinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            LinkedListNode node = new LinkedListNode(data);
            current.setNext(node);
        }
        size++;
    }

    public void insertBefore(String data, String before) {
        LinkedListNode node = new LinkedListNode(before);
        if (head == null) {
            System.out.println(" { " + data + " } " + " Not Exist");
            return;
        } else if (data == head.getData()) {
            node.next = head;
            head = node;
            size++;
        } else {
            LinkedListNode temp = head;
            while (temp.next != null) {
                if (temp.next.getData() == data) {
                    node.next = temp.next;
                    temp.next = node;
                    size++;
                    return;
                }
                temp = temp.next;
            }
            System.out.println(" { " + data + " } " + " Not Exist");
        }
    }

    public void insertAfter(String data, String after) {
        LinkedListNode node = new LinkedListNode(after);
        if (head == null) {
            System.out.println(" { " + data + " } " + " Not Exist");
            return;
        } else {
            LinkedListNode temp = head;
            while (temp != null) {
                if (temp.getData() == data) {
                    node.next = temp.next;
                    temp.next = node;
                    size++;
                    return;
                }
                temp = temp.next;
            }
            System.out.println(" { " + data + " } " + " Not Exist");
        }

    }

    /**
     * Code Challenge 07
     */

    public String kthFromEnd(int index) {

        LinkedListNode current = head;
        if (head == null) {
            System.out.println("The list is empty");
        }
            if (index > getSize() - 1 || index < 0) {
                return "Exception";
            }
            int i = 0;
            while (i < (getSize() - index - 1)) {
                current = current.getNext();
                i++;
            }
            return current.getData();
    }

    /**
     * Code Challenge 08
     */

    public LinkedList zipLists(LinkedList linkedList1, LinkedList linkedList2) {
        if(linkedList1.head == null && linkedList2.head == null) {
            System.out.println("Both Lists Are Empty");
            return null;
        } else if (linkedList1.head == null) {
            return linkedList2;
        } else if (linkedList2.head == null) {
            return linkedList1;
        } else {
            LinkedListNode current1 = linkedList1.head;
            LinkedListNode current2 = linkedList2.head;
            LinkedListNode temp1, temp2;

            while (current1.getNext() != null && current2 != null) {

                temp1 = current1.getNext();
                temp2 = current2.getNext();
                current1.setNext(current2);
                current2.setNext(temp1);
                current1 = temp1;
                current2 = temp2;

                size++;

                if(current1.getNext() == null){
                    current1.setNext(current2);
                    break;
                }
            }
        }

        return linkedList1;
    }

}
