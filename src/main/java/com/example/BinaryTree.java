package com.example;

public class BinaryTree {
    
    Node root;

    public void addNode(int key, String name) {

        Node newNode = new Node(key, name);
        
        if(root == null) {
            
            root = newNode;
        
        } else {

            Node focusNode = root;

            Node parent;

            while(true) {

                parent = focusNode;

                if(key < focusNode.key) {

                    focusNode = parent.leftChild;

                    if(focusNode == null) {

                        focusNode = newNode;
                        return;

                    }

                } else {

                    focusNode = parent.rightChild;

                    if(focusNode == null) {

                        focusNode = newNode;
                        return;

                    }

                }

            }

        }

    }

}