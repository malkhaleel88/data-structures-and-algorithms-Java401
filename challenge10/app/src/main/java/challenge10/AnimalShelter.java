package challenge10;

import challenge10.queue.structure.Queue;

public class AnimalShelter {

    Queue catQueue = new Queue();
    Queue dogQueue = new Queue();



    /**
     *  Code Challenge 12
     */

    public void enqueue(Animal animal){

        if (animal instanceof Cat){
            catQueue.enqueue(animal.getPref());
        }else if(animal instanceof Dog){
            dogQueue.enqueue(animal.getPref());
        }else{
            System.out.println("Shelter Only Received Cat And Dogs");
        }
    }

    public String dequeue(String pref){
        if(pref.equals("cat") && !catQueue.isEmpty()){
            return catQueue.dequeue();
        }else if (pref.equals("dog") && !dogQueue.isEmpty()){
            return dogQueue.dequeue();
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catQueue=" + catQueue +
                ", dogQueue=" + dogQueue +
                '}';
    }
}
