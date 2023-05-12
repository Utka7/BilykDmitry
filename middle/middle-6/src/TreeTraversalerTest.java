import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TreeTraversalerTest {

    @Test
    void postrderTraversal_ValidTree_ValidOutput() {
        var root = buildTree();
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        var treeTraversaler = new TreeTraversaler<Integer>();
        treeTraversaler.postrderTraversal(root);
        String result = byteArrayOutputStream.toString();
        assertEquals("5 6 2 7 8 3 4 1 ", result);
    }

    public Node<Integer> buildTree() {
        var root = new Node<Integer>(1);
        root.addChild(new Node<>(2));
        root.addChild(new Node<>(3));
        root.addChild(new Node<>(4));
        root.getChildren().get(0).addChild(new Node<>(5));
        root.getChildren().get(0).addChild(new Node<>(6));
        root.getChildren().get(1).addChild(new Node<>(7));
        root.getChildren().get(1).addChild(new Node<>(8));
        return root;
    }
}