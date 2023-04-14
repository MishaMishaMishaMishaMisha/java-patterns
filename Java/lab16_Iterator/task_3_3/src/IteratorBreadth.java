import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class IteratorBreadth implements Iterator<Component> {

    private Queue<Component> queue;

    public IteratorBreadth(Component root) {
        queue = new LinkedList<>();
        queue.offer(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        Component node = queue.poll();

        if (node instanceof Box) {
            Box box = (Box) node;
            for (Component child : box.getChildren()) {
                queue.offer(child);
            }
        }

        return node;
    }


}