import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTraversalerTest {

    @Test
    void breadthTraversal() {
        var root = TreeTraversalerTest.buildTree();
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        var treeTraversaler = new TreeTraversaler();
        treeTraversaler.breadthTraversal(root);
        String result = byteArrayOutputStream.toString();
        assertEquals("1 2 3 4 5 6 7 8 ", result);
    }

    public static Node buildTree() {
        var root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));
        root.getRight().getRight().setLeft(new Node(8));
        return root;
    }
}