import java.util.*;

public class IteratorSortAmount implements Iterator<ShopItem> {

    private final  HashMap<String, ShopItem> collection;
    private ArrayList<ShopItem> values;
    private int iterationState;

    public IteratorSortAmount(Shop collection) {
        this.collection = collection.getItems();
        values = new ArrayList<>(collection.getItems().values());
        iterationState = 0;

        // сортуємо по кількості
        Collections.sort(values, new Comparator<ShopItem>() {
            @Override
            public int compare(ShopItem i1, ShopItem i2) {
                return Integer.compare(i2.getQuantity(), i1.getQuantity());
            }
        });
    }

    @Override
    public boolean hasNext() {
        return iterationState < values.size();
    }

    @Override
    public ShopItem next() {
        //return collection.get(values.get(iterationState++));
        return values.get(iterationState++);
    }

}
