import java.util.HashMap;
import java.util.Iterator;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();
    private IteratorFactory iteratorFactory = null;

    public void putItem(ShopItem item){
        items.put(item.getName(), item);
    }
    public ShopItem getItem(String name) {
        return items.get(name);
    }
    public HashMap<String, ShopItem> getItems() {
        return items;
    }
    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);
    }

}