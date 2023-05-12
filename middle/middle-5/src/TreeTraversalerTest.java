import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTraversalerTest {

    @Test
    void preorderTraversal_ValidTree_ReturnTraverseInOrder() {
        var root = buildTree();
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        var treeTraversaler = new TreeTraversaler<Integer>();
        treeTraversaler.preorderTraversal(root);
        String result = byteArrayOutputStream.toString();
        assertEquals("1 2 5 6 3 7 8 4 ", result);
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