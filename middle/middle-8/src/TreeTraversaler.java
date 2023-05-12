import java.util.LinkedList;

public class TreeTraversaler {
    public void breadthTraversal(Node root) {
        if (root == null) {
            return;
        }
        var queue = new LinkedList<Node>();
        queue.add(root);

        while (queue.size() != 0) {
            var node = queue.poll();
            System.out.println(node.getValue() + " ");
            queue.add(node.getLeft());
            queue.add(node.getRight());
        }
    }
}
