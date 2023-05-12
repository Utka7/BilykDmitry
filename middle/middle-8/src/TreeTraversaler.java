import java.util.LinkedList;

public class TreeTraversaler {
    public void breadthTraversal(Node root) {
        if (root == null) {
            return;
        }
        var queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var node = queue.poll();
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }
}
