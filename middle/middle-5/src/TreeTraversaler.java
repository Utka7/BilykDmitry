public class TreeTraversaler<T> {
    public void preorderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        for (var child : root.children){
            preorderTraversal(child);
        }
    }
}
