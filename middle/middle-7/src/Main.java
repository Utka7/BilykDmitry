public class Main {
    public static void main(String[] args) {
        var root = buildTree();
        var treeTraversaler = new TreeTraversaler();
        treeTraversaler.inorderTraversal(root);
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