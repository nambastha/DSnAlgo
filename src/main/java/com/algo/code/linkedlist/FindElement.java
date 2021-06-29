package com.algo.code.linkedlist;


import java.util.LinkedList;

public class FindElement {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("c");
        list.add("D");
        System.out.println("LinkedList size: "+list.size());
        list.addFirst("Z");
        list.add(2,"12");
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("get specific value: "+ list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }


}


