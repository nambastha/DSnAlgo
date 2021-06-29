package com.algo.code.linkedlist;

public class DoublyLinkedList {
   Node head; // head of list

    // Doubly Linked list Node.
    // Node is a static nested class
    // so main() can access it
     class Node {

        int data;
        Node next;
        Node prev;

        // Constructor
        Node(int d)
        {
            data = d;
        }
    }


    public void push(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node new_Node = new Node(new_data);

        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.prev = null;

        System.out.println("new_Node.next :"+new_Node.next);
        System.out.println("new_Node.prev :"+new_Node.prev);
        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = new_Node;

        /* 5. move the head to point to the new node */
        head = new_Node;
    }

    public static void main(String args[]){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.push(29);
        doublyLinkedList.push(63);
        System.out.println(doublyLinkedList.head.data);

    }
}
