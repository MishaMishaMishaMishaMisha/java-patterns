import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionElements implements IterableCollection {

    private final List<Element> elements = new ArrayList<>();

    public CollectionElements(Element... elements) {
        this.elements.addAll(List.of(elements));
    }

    List<Element> getElements() {
        return elements;
    }
    public void add(Element element){
        elements.add(element);
    }

    @Override
    public String toString() {
        return "ConcreteCollection{" +
                "elements=" + elements +
                '}';
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}