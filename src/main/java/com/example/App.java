package com.example;

public class App 
{
    public static void main( String[] args )
    {
        BinaryTree tree = new BinaryTree();

        tree.addNode(50, "root");
        tree.addNode(25, "root/leftChild");
        tree.addNode(15, "root/leftChild/leftChild");
        tree.addNode(30, "root/leftChild/rightChild");
        tree.addNode(65, "root/rightChild");
        tree.addNode(85, "root/rightChild/rightChild");

        tree.inOrderTraverseList(tree.root);
    }
}
