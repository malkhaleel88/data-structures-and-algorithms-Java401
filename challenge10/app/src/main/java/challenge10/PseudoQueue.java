package challenge10;

import challenge10.stack.structure.Stack;

public class PseudoQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public PseudoQueue() {
    }

    public Stack getStack1() {
        return stack1;
    }

    public Stack getStack2() {
        return stack2;
    }

    /**
     *  Code Challenge 11
     */

    public void enqueue(String value) {
        stack1.push(value);
    }

    public String dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return "Both Stacks Empty";
        }
        if (stack2.getTop() == null) {
            while (stack1.getTop() != null) {
                stack2.push(stack1.pop());
            }
        }
        String value = stack2.pop();
        if (stack1.getTop() == null) {
            while (stack2.getTop() != null) {
                stack1.push(stack2.pop());
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "stack1=" + stack1;
    }
}

