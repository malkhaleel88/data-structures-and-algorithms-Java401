/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge10;

import challenge10.queue.structure.Queue;
import challenge10.stack.structure.Stack;

public class App {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("A");
        stack.push("A");
        stack.push("Y");
        stack.push("E");
        stack.push("D");

        System.out.println( "The Top Of The Stack is => " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("=========================================");

        Queue queue = new Queue();

        queue.enqueue("M");
        queue.enqueue("O");
        queue.enqueue("H");
        queue.enqueue("A");
        queue.enqueue("M");
        queue.enqueue("M");
        queue.enqueue("A");
        queue.enqueue("D");


        System.out.println("The Front Of The Queue is => " + queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("=========================================");

        PseudoQueue pseudoQueue = new PseudoQueue();

        pseudoQueue.enqueue("M");
        pseudoQueue.enqueue("O");
        pseudoQueue.enqueue("H");
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("M");
        pseudoQueue.enqueue("M");
        pseudoQueue.enqueue("A");
        pseudoQueue.enqueue("D");


        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.dequeue());

    }

}
