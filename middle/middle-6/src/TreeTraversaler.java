public class TreeTraversaler<T> {
    public void preorderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        for (var child : root.getChildren()){
            preorderTraversal(child);
        }
        System.out.print(root.getValue() + " ");
    }
}
