public class TreeTraversaler<T> {
    public void preorderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getVal() + " ");
        for (var child : root.getChildren()){
            preorderTraversal(child);
        }
    }
}
