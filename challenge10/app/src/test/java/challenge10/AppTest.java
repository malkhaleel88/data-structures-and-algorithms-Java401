/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge10;

import challenge10.queue.structure.Queue;
import challenge10.stack.structure.Stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    /**
     *  Code Challenge 10 TEST
    */

    @Test
    public void pushToStackTest(){
        Stack stackTest = new Stack();

        stackTest.push("M");
        stackTest.push("O");
        stackTest.push("H");
        stackTest.push("A");

        assertEquals("Stack{top=StackNode{data='A', next=StackNode{data='H', next=StackNode{data='O', next=StackNode{data='M', next=null}}}}}", stackTest.toString());
    }

    @Test
    public void popStackTest(){
        Stack stackTest = new Stack();

        stackTest.push("M");
        stackTest.push("O");
        stackTest.push("H");
        stackTest.push("A");
        stackTest.pop();

        assertEquals("Stack{top=StackNode{data='H', next=StackNode{data='O', next=StackNode{data='M', next=null}}}}", stackTest.toString());
    }

    @Test
    public void emptyStackTest(){
        Stack stackTest = new Stack();

        stackTest.push("M");
        stackTest.push("O");
        stackTest.push("H");
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();

        assertTrue(stackTest.isEmpty());
    }

    @Test
    public void peekStackTest(){
        Stack stackTest = new Stack();

        stackTest.push("M");
        stackTest.push("O");
        stackTest.push("H");

        assertEquals("H", stackTest.peek());

        stackTest.pop();
        assertEquals("O", stackTest.peek());
    }

    @Test
    public void enqueueToQueueTest(){
        Queue queueTest = new Queue();

        queueTest.enqueue("M");
        queueTest.enqueue("O");
        queueTest.enqueue("H");

        assertEquals("Queue{front=QueueNode{data='M', next=QueueNode{data='O', next=QueueNode{data='H', next=null}}}, rear=QueueNode{data='H', next=null}}", queueTest.toString());
    }

    @Test
    public void dequeueFromQueueTest(){
        Queue queueTest = new Queue();

        queueTest.enqueue("M");
        queueTest.enqueue("O");
        queueTest.enqueue("H");
        queueTest.dequeue();

        assertEquals("Queue{front=QueueNode{data='O', next=QueueNode{data='H', next=null}}, rear=QueueNode{data='H', next=null}}", queueTest.toString());
    }

    @Test
    public void emptyQueueTest(){
        Queue queueTest = new Queue();

        queueTest.enqueue("M");
        queueTest.enqueue("O");
        queueTest.enqueue("H");
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();

        assertTrue(queueTest.isEmpty());
    }

    @Test
    public void peekQueueTest(){
        Queue queueTest = new Queue();

        queueTest.enqueue("M");
        queueTest.enqueue("O");
        queueTest.enqueue("H");

        assertEquals("M",queueTest.peek());

        queueTest.dequeue();
        assertEquals("O",queueTest.peek());
    }

    /**
     *  Code Challenge 11 TEST
     */

    @Test
    public void PseudoEnqueueTest() {
        PseudoQueue testPesudoQueue = new PseudoQueue();

        testPesudoQueue.enqueue("M");
        testPesudoQueue.enqueue("O");
        testPesudoQueue.enqueue("H");
        testPesudoQueue.enqueue("A");

        assertEquals("stack1=Stack{top=StackNode{data='A', next=StackNode{data='H', next=StackNode{data='O', next=StackNode{data='M', next=null}}}}}", testPesudoQueue.toString());
    }

    @Test
    public void PesudoDequeueTest(){
        PseudoQueue testPesudoQueue = new PseudoQueue();

        testPesudoQueue.enqueue("M");
        testPesudoQueue.enqueue("O");
        testPesudoQueue.enqueue("H");
        testPesudoQueue.enqueue("A");

        assertEquals("M", testPesudoQueue.dequeue());

        testPesudoQueue.dequeue();
        testPesudoQueue.dequeue();
        testPesudoQueue.dequeue();

        assertEquals("stack1=Stack{top=null}",testPesudoQueue.toString());
        assertEquals("Both Stacks Empty", testPesudoQueue.dequeue());
    }

    /**
     *  Code Challenge 12 TEST
     */


    @Test
    public void enqueueDequeueAnimalShelterTest() {

        AnimalShelter shelterTest = new AnimalShelter();

        Animal cat1 = new Cat("miao");
        Cat cat2 = new Cat("nemnem");
        Animal dog1 = new Dog("woof");
        Dog dog2 = new Dog("husky");

        shelterTest.enqueue(cat1);
        shelterTest.enqueue(cat2);
        shelterTest.enqueue(dog1);
        shelterTest.enqueue(dog2);
        assertEquals("AnimalShelter{catQueue=Queue{front=QueueNode{data='miao', next=QueueNode{data='nemnem', next=null}}, rear=QueueNode{data='nemnem', next=null}}, dogQueue=Queue{front=QueueNode{data='woof', next=QueueNode{data='husky', next=null}}, rear=QueueNode{data='husky', next=null}}}", shelterTest.toString());

        assertFalse(shelterTest.catQueue.isEmpty());
        assertFalse(shelterTest.dogQueue.isEmpty());

        shelterTest.dequeue("cat");
        assertEquals("AnimalShelter{catQueue=Queue{front=QueueNode{data='nemnem', next=null}, rear=QueueNode{data='nemnem', next=null}}, dogQueue=Queue{front=QueueNode{data='woof', next=QueueNode{data='husky', next=null}}, rear=QueueNode{data='husky', next=null}}}", shelterTest.toString());

        shelterTest.dequeue("dog");
        assertEquals("AnimalShelter{catQueue=Queue{front=QueueNode{data='nemnem', next=null}, rear=QueueNode{data='nemnem', next=null}}, dogQueue=Queue{front=QueueNode{data='husky', next=null}, rear=QueueNode{data='husky', next=null}}}", shelterTest.toString());

        shelterTest.dequeue("cat");
        shelterTest.dequeue("dog");
        assertEquals("AnimalShelter{catQueue=Queue{front=null, rear=QueueNode{data='nemnem', next=null}}, dogQueue=Queue{front=null, rear=QueueNode{data='husky', next=null}}}", shelterTest.toString());

        assertTrue(shelterTest.catQueue.isEmpty());
        assertTrue(shelterTest.dogQueue.isEmpty());

        assertNull(shelterTest.dequeue("cat"));
        assertNull(shelterTest.dequeue("dog"));
    }

    /**
     *  Code Challenge 13 TEST
     */

    @Test
    public void validateBracketsTest(){

        StackQueueBrackets stackQueueBracketsTest = new StackQueueBrackets();

        assertTrue(stackQueueBracketsTest.validateBrackets("{}"));
        assertTrue(stackQueueBracketsTest.validateBrackets("{}(){}"));
        assertTrue(stackQueueBracketsTest.validateBrackets("()[[Extra Characters]]"));
        assertTrue(stackQueueBracketsTest.validateBrackets("(){}[[]]"));
        assertTrue(stackQueueBracketsTest.validateBrackets(""));

        assertFalse(stackQueueBracketsTest.validateBrackets("[({}]"));
        assertFalse(stackQueueBracketsTest.validateBrackets("(]("));
        assertFalse(stackQueueBracketsTest.validateBrackets("{(})"));
        assertFalse(stackQueueBracketsTest.validateBrackets(")"));
        assertFalse(stackQueueBracketsTest.validateBrackets("[}"));
        assertFalse(stackQueueBracketsTest.validateBrackets("["));


    }


}
