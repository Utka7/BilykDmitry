import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTraversalerTest {

    @Test
    void inorderTraversal_ValidTree_ValidOutput() {
        var root = buildTree();
        var byteArrayOutputStream = new ByteArrayOutputStream();
        var printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        var treeTraversaler = new TreeTraversaler();
        treeTraversaler.inorderTraversal(root);
        String result = byteArrayOutputStream.toString();
        assertEquals("4 2 5 1 6 3 8 7 ", result);
    }

    public Node buildTree() {
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
