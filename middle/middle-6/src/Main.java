public class Main {
    public static void main(String[] args) {
        var root = TreeTraversalerTest.buildTree();
        var treeTraversaler = new TreeTraversaler<Integer>();
        treeTraversaler.postrderTraversal(root);
    }


}