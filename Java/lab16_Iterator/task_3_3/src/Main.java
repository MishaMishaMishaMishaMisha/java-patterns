import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {

                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        //root.execute();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        IteratorDepth iteratorDepth = new IteratorDepth(root);
        while (iteratorDepth.hasNext()) {
            Component component = iteratorDepth.next();
            System.out.println(component);
            if (component instanceof Item) {
                Item item = (Item) component;
                int value = item.getValue();
                if (value <= min) {
                    min = value;
                }
                if (value >= max) {
                    max = value;
                }
            }
        }

        System.out.println("\n##########################\n");

        IteratorBreadth iteratorBreadth = new IteratorBreadth(root);
        while (iteratorBreadth.hasNext()) {
            Component component = iteratorBreadth.next();
            System.out.println(component);
        }

        System.out.printf("Maximum value = %d\n", max);
        System.out.printf("Minimum value = %d", min);

    }
}