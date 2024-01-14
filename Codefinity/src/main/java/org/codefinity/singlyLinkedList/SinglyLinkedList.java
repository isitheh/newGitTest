package org.codefinity.singlyLinkedList;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        //head will store the first element of our data structure.
        this.head = null;
    }

    /*
        Implement all the CRUD operations
        Create - call it create.
        Read - call it read.
        Update - call it update.
        size() - returns the length of the list
        delete - call it delete
    */

    public void create(int data) {
        Node newNode = new Node(data);

        //If the head is null, install the new node as the head of the list
        if(head == null) {
            head = newNode;
            //done
            return;
        }
        //Start at the head and iterate to the end of the list where next element is null
        Node currentNode = head;
        while(currentNode.next != null) {
            //Go to the last node in the list
            currentNode = currentNode.next;
        }

        //Make the new node the current node - Added new element into our list successfully.
        currentNode.next = newNode;
    }

    public void read() {
        //Go to the beginning of our list
        Node currentNode = head;

        /*
            If there exists a next element,
            print the current element then set
            the next element to be the current
         */
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        //Next line - For a clean display.
        System.out.println();
    }

    //Insert the newData at the given index
    public void update(int index, int newData) {
        if(index < 0 || index >= size()) {
            System.out.println("Index is invalid");
            return;
        }

        /*
            Point to the beginning and iterate to the
            index and insert new value there.
        */
        Node currentNode = head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        //Made it to the desired index via iterates.
        currentNode.data = newData;
    }

    //size() - returns the length of the list
    public int size() {
        int result = 0;
        //Go to the beginning of our list
        Node currentNode = head;

        /*
            Iterate through the entire list until next
            is null while incrementing the result for size
        */
        while(currentNode != null) {
            result++;
            currentNode = currentNode.next;
        }
        return result;
    }

    //Delete the data at the given index
    public void delete(int index) {
        if(index < 0 || index >= size()) {
            System.out.println("Index is invalid. Can not delete.");
            return;
        }

        //Go to the beginning of our list
        Node currentNode = head;
        if(index == 0) {
            head = currentNode.next;
            return;
        }

        /*
            Point to the beginning and iterate to the
            index and delete the value found there.
        */
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        /*
            Made it to the desired index via iterating for loop.
            Skip the element at that position from our list
         */
        currentNode.next = currentNode.next.next;
    }
}
