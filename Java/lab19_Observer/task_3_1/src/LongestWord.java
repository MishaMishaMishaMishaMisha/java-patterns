public class LongestWord implements Subscriber {

    private int amount = 0;
    private String max_word = "";
    private String line_with_max_word = "";

    @Override
    public void update(String line) {
        String[] words = line.split("\\s+");
        boolean isFound = false;
        for (String word : words) {
            if (word.length() > amount) {
                isFound = true;
                amount = word.length();
                max_word = word;
                line_with_max_word = line;
            }
        }

        if (isFound) {
            System.out.println("Знайдене довше слово \"" + max_word + "\" з " + amount + " символів.");
            System.out.println("Знайдений рядок в якому міститься найбільше слово \"" + line_with_max_word + "\"");
        }
    }

    public String getMax_word() {
        return max_word;
    }
    public String getLine_with_max_word() {
        return line_with_max_word;
    }

}
