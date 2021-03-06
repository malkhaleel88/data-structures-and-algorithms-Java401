# **15.Trees**

* **A Tree** is a non-linear data structure where data objects are generally organized in terms of hierarchical relationship. The structure is non-linear in the sense that, unlike Arrays, Linked Lists, Stack and Queues, data in a tree is not organized linearly.

* **A binary tree** is a recursive tree data structure where each node can have 2 children at most.

## **Challenge**

- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a Binary Tree class :
  - Define a method for each of the depth first traversals :
    * pre order
    * in order
    * post order
 
    Which returns an array of the values, ordered appropriately.

- Create a Binary Search Tree class
with the following additional methods:
  - Add
    
    Adds a new node with that value in the correct location in the binary search tree.

  - Contains

    Returns: boolean indicating whether or not the value is in the tree at least once.

## **Approach & Efficiency**

### **1. Binary Trees**

- The Big O time complexity for inserting a new node and Searching is O(n).

- The Big O space complexity for a node insertion using breadth first insertion will be O(w), where w is the largest width of the tree.

### **2. Binary Search Trees**

- The Big O time complexity of a Binary Search Tree’s insertion and search operations is O(h), or O(height). 

- The Big O space complexity of a BST search would be O(1).

## **API**

- In **Binary Tree** class we have 3 traversals methods, return an array of the values, ordered appropriately.

  1. pre order
  2. in order
  3. post order. 


- In **Binary Search Tree** class we have 2 methods:

  **1. Add**  
    - Arguments: value  
    - Return: nothing  
      Adds a new node with that value in the correct location in the binary search tree.
     
  **2. Contains**  
    - Argument: value  
    - Returns: boolean indicating whether or not the value is in the tree at least once.

-------------------------------------------------------------------------------------------------------------

# **16.Tree Max**

## **Challenge Summary**

- We asked to write a method that finds the maximum numeric value stored in the binary tree.
  * Method: **treeMax()**
  * Arguments: none
  * Returns: number

## **Whiteboard Process**

![Tree Max](./assets/tree-max.jpg)

## **Approach & Efficiency**

- **Space: O(n)**

- **Time: O(n)**

-------------------------------------------------------------------------------------------------------------

# **17.Tree Breadth First**

## **Challenge Summary**

- We asked to write  breadth first method for breadth first traversal in a binary tree.
  * Method: **breadthFirst(tree)**
  * Arguments: tree
  * Returns: list of all values in the tree, in the order they were encountered
## **Whiteboard Process**

![Tree Breadth First](./assets/tree-breadth-first.jpg)

## **Approach & Efficiency**

- **Space: O(n)**

- **Time: O(n)**

-------------------------------------------------------------------------------------------------------------

# **18.Tree Fizz Buzz**

## **Challenge Summary**

- Write a function called fizz buzz tree.
  * Arguments: k-ary tree
  * Return: new k-ary tree
- Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the   same structure as the original, but the values modified as follows:
  * If the value is divisible by 3, replace the value with “Fizz”.
  * If the value is divisible by 5, replace the value with “Buzz”.
  * If the value is divisible by 3 and 5, replace the value with “FizzBuzz”.
  * If the value is not divisible by 3 or 5, simply turn the number into a String.

## **Whiteboard Process**

![Tree Fizz Buzz](./assets/tree-fizz-buzz.jpg)

## **Approach & Efficiency**

- **Space: O(n)**

- **Time: O(n)**
