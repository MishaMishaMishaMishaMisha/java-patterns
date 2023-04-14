import java.util.*;
import java.util.ArrayList;

public class IteratorSortName implements Iterator<ShopItem> {

    private final  HashMap<String, ShopItem> collection;
    private ArrayList<String> keys;
    private int iterationState;

    public IteratorSortName(Shop collection) {
        this.collection = collection.getItems();
        keys = new ArrayList<>(collection.getItems().keySet());
        keys.sort(String::compareTo);
        iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < keys.size();
    }

    @Override
    public ShopItem next() {
        return collection.get(keys.get(iterationState++));
    }

}