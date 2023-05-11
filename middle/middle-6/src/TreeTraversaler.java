public class TreeTraversaler<T> {
    public void postrderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        for (var child : root.getChildren()) {
            postrderTraversal(child);
        }
        System.out.print(root.getValue() + " ");
    }
}
