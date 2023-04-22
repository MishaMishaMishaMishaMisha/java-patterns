public class LongestLine implements Subscriber {

    private int amount = 0;
    private String max_line = "";

    @Override
    public void update(String line) {
        if (line.length() > amount) {
            amount = line.length();
            max_line = line;
            System.out.println("Знайдений довший рядок з " + amount + " символів.");
        }
    }

    public String getMax_line() {
        return max_line;
    }

}
