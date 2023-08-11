package com.example;

public class Node {

    /*
     * ALL NODES IN BINARY TREE NEEDS TO HAVE INT FOR THE KEY, NAME FOR THE NODE, LEFT CHILD FOR LESSER KEY, AND RIGHT CHILD FOR BIGGER KEY.
     */
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return (name + " has a key " + key + "\n");
    }

}
