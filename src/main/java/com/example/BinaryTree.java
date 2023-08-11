package com.example;

public class BinaryTree {
    
    //Every binary tree needs a root
    Node root;

    //Method to add Nodes into the binary tree
    public void addNode(int key, String name) {

        //Instantiate new nodes to be added into the tree
        Node newNode = new Node(key, name);
        
        //If tree is empty, new node is the root
        if(root == null) {
            root = newNode;
        
        //If tree is not empty, nodes are inserted according to the key
        } else {

            //Create 2 nodes, one for the current node & one for the parent
            Node focusNode = root;
            Node parent;

            //Start an endless loop
            while(true) {

                //set parent to be the node needs to be focused
                parent = focusNode;

                //if key is lower than the parent key, set the left child to focus. If null, set the new node to the left child and exit
                if(key < parent.key) {
                    focusNode = parent.leftChild;
                    if(parent.leftChild == null) {
                        parent.leftChild = newNode;
                        return;
                    }

                //if key is higher than the parent key, set the right child to focus. If null, set the new node to the right child and exit
                } else {
                    focusNode = parent.rightChild;
                    if(parent.rightChild == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //set the binary tree to an in order list. Keep looking at the left child until it hits null and print the previous left child. Using recursion, keep recalling the method in the order of left, parent, right, until it hits the rightmost branch.
    public String inOrderTraverseList(Node focusNode) {
        if (focusNode == null) {
            return "";
        }
        String leftChild = inOrderTraverseList(focusNode.leftChild);
        String parentNode = focusNode.toString();
        String rightChild = inOrderTraverseList(focusNode.rightChild);
        return leftChild + parentNode + rightChild;
    }

    //set the binary tree to a pre order list that focuses on the left branches. Starting from the root, it prints out all of the left branch as far as possible before backtracking and calls all the right branches on the way back. The order is parent, left, right
    public String preOrderTraverseList(Node focusNode) {
        if (focusNode == null) {
            return "";
        }
        String parentNode = focusNode.toString();
        String leftChild = preOrderTraverseList(focusNode.leftChild);
        String rightChild = preOrderTraverseList(focusNode.rightChild);
        return parentNode + leftChild + rightChild;
    }

    //set the binary tree to a post order list that focuses on the furthest branches. Starting from the left branch of the root, it will print out the furthest left, right, parent, then backtrack to print all of the parents. Then it continues to the right branch of the root, it will continue to print the furthest left, right, parent, then backtrack to print the previous parents all the way to the root.
    public String postOrderTraverseList(Node focusNode) {
        if (focusNode == null) {
            return "";
        }
        String leftChild = postOrderTraverseList(focusNode.leftChild);
        String rightChild = postOrderTraverseList(focusNode.rightChild);
        String parentNode = focusNode.toString();
        return leftChild + rightChild + parentNode;
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }
}
