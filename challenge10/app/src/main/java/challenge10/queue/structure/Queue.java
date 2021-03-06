package challenge10.queue.structure;

import challenge10.queue.data.QueueNode;


public class Queue {

    private QueueNode front;
    private QueueNode rear;

    public Queue() {

    }

    /**
     *  Code Challenge 10 Queue
    */

    public void enqueue(String data) {
        if (isEmpty()) {
            QueueNode node = new QueueNode(data);
            front = node;
            rear = node;
        } else {
            QueueNode node = new QueueNode(data);
            rear.setNext(node);
            rear = node;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            return "The Queue Is Empty";
        } else {
            String data = front.getData();
            front = front.getNext();
            return data;
        }
    }

    public String peek() {
        return front.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
