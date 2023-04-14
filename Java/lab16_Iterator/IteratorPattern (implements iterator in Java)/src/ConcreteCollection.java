import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteCollection implements Iterable<Element> {

    private final List<Element> elements = new ArrayList<>();
    private IteratorFactory iteratorFactory;

    public ConcreteCollection(Element... elements) {
        this.elements.addAll(List.of(elements));
    }

    List<Element> getElements() {
        return elements;
    }
    public void add(Element element) {
        elements.add(element);
    }
    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @Override
    public String toString() {
        return "ConcreteCollection{" +
                "elements=" + elements +
                '}';
    }
    @Override
    public Iterator<Element> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);
    }
}