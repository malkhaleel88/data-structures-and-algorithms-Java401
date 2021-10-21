package challenge15.data;

import java.util.ArrayList;
import java.util.List;

public class KaryTreeNode<T> {

    public T value;
    public List<KaryTreeNode<T>> children = new ArrayList<>();

    public KaryTreeNode(T value) {
        this.value = value;
    }


    public List<KaryTreeNode<T>> getChildren() {
        return children;
    }

    public void addChild(KaryTreeNode<T> child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        result.append(value);
        result.append(" ");
        for (KaryTreeNode<T> ch : children) {
            result.append(" ");
            result.append(ch);
        }
        result.append(" ");

        return result.toString();
    }
}
