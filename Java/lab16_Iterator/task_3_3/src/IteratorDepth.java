import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class IteratorDepth implements Iterator<Component> {

    private Stack<Component> stack;
    int q;

    public IteratorDepth(Component root) {
        stack = new Stack<>();
        stack.push(root);
        q=0;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        Component node = stack.pop();

        if (node instanceof Box) {
            Box box = (Box) node;
            List<Component> children = box.getChildren();

            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }

        return node;
    }


}
