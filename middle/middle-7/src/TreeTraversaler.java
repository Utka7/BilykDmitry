public class TreeTraversaler {
    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        System.out.print(root.getValue() + " ");
        inorderTraversal(root.getRight());
    }
}
