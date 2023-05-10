public class Main {
    public static void main(String[] args) {
        var root = buildTree();
        var treeTraversaler = new TreeTraversaler<Integer>();
        treeTraversaler.preorderTraversal(root);
    }

    public static Node<Integer> buildTree() {
        Node<Integer> root = new Node<>(1);
        root.addChild(new Node<>(2));
        root.addChild(new Node<>(3));
        root.addChild(new Node<>(4));
        root.children.get(0).addChild(new Node<>(5));
        root.children.get(0).addChild(new Node<>(6));
        root.children.get(1).addChild(new Node<>(7));
        root.children.get(1).addChild(new Node<>(8));
        return root;
    }
}