import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private int value;
    private List<Node<T>> children;

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {
        this.value = value;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }

    public void addChild(Node<T> child) {
        this.children.add(child);
    }
}
