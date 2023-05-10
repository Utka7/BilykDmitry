import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    int val;
    List<Node<T>> children;

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public void addChild(Node<T> child){
        this.children.add(child);
    }
}
