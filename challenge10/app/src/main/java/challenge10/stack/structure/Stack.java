package challenge10.stack.structure;


import challenge10.stack.data.StackNode;


public class Stack {

    private StackNode top;

    public Stack() {

    }

    public StackNode getTop() {
        return top;
    }

    public void setTop(StackNode top) {
        this.top = top;
    }

    /**
     *  Code Challenge 10 Stack
    */

    public void push(String data) {
        if (isEmpty()) {
            StackNode node = new StackNode(data);
            top = node;
        } else {
            StackNode node = new StackNode(data);
            node.setNext(top);
            top = node;
        }
    }

    public String pop() {
        if (isEmpty()) {
            return "The Stack Is Empty";
        } else {
            String data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public String peek() {
        if (isEmpty()) {
            return "The Stack Is Empty";
        } else {
            return top.getData();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
