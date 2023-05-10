import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private int val;
    private List<Node<T>> children;

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }

    public void addChild(Node<T> child){
        this.children.add(child);
    }
}
