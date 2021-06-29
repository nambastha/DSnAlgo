package com.algo.code.linkedlist;

public class DLLs {
    Node head = null;
    Node tail = null;
    int size ;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);

        if (head==null){
            head=newNode;
            tail=newNode;
            head.prev=null;
            tail.next=null;
            head.next=null;
            tail.prev=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
        size++ ;
    }

    public static void main(String args[]){
        DLLs dll = new DLLs();
        dll.addNode(25);
        dll.addNode(69);
        dll.addNode(17);
        System.out.println("dll head :"+dll.head.data);
        System.out.println("dll tail :"+dll.tail.data);
        for (int i=0;i<dll.size;i++){
            System.out.println(dll);
        }
    }
}
