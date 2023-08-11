package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BinaryTreeTest {

    BinaryTree tree = new BinaryTree();

    @Before
    public void setup() {
        tree.addNode(50, "fifty");
        tree.addNode(30, "thirty");
        tree.addNode(60, "sixty");
        tree.addNode(15, "fifteen");
        tree.addNode(35, "thirty-five");
        tree.addNode(55, "fifty-five");
        tree.addNode(75, "seventy-five");
        tree.addNode(10, "ten");
        tree.addNode(20, "twenty");
        tree.addNode(40, "forty");
        tree.addNode(65, "sixty-five");
        tree.addNode(80, "eighty");
    }

    @Test
    public void inOrderTraverseListTest(){
        String expected = tree.inOrderTraverseList(tree.root);
        String actual = "ten has a key 10\nfifteen has a key 15\ntwenty has a key 20\nthirty has a key 30\nthirty-five has a key 35\nforty has a key 40\nfifty has a key 50\nfifty-five has a key 55\nsixty has a key 60\nsixty-five has a key 65\nseventy-five has a key 75\neighty has a key 80\n";
        assertEquals(expected, actual);
    }

    @Test
    public void preOrderTraverseListTest(){
        String expected = tree.preOrderTraverseList(tree.root);
        String actual = "fifty has a key 50\nthirty has a key 30\nfifteen has a key 15\nten has a key 10\ntwenty has a key 20\nthirty-five has a key 35\nforty has a key 40\nsixty has a key 60\nfifty-five has a key 55\nseventy-five has a key 75\nsixty-five has a key 65\neighty has a key 80\n";
        assertEquals(expected, actual);
    }

    @Test
    public void postOrderTraverseListTest(){
        String expected = tree.postOrderTraverseList(tree.root);
        String actual = "ten has a key 10\ntwenty has a key 20\nfifteen has a key 15\nforty has a key 40\nthirty-five has a key 35\nthirty has a key 30\nfifty-five has a key 55\nsixty-five has a key 65\neighty has a key 80\nseventy-five has a key 75\nsixty has a key 60\nfifty has a key 50\n";
        assertEquals(expected, actual);
    }

    @Test
    public void findNodeTest1(){
        assertEquals(tree.findNode(10).toString(), "ten has a key 10\n");
    }

    @Test
    public void findNodeTest2(){
        assertEquals(tree.findNode(80).toString(), "eighty has a key 80\n");
    }

    @Test
    public void findNodeTest3(){
        assertEquals(tree.findNode(51), null);
    }
}
