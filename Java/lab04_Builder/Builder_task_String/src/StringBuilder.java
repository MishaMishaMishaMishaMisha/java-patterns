public class StringBuilder {

    String string = "default";

    StringBuilder setString(String string) {
        this.string = string;
        return this;
    }
    StringBuilder addString(String string) {
        this.string += string;
        return this;
    }
    StringBuilder insertString(String string, int pos) {
        if (pos > this.string.length()) {
            System.out.printf("Cannot insert the string. Index must be >= 0 and <= %d\n", this.string.length());
            return this;
        }

        String firstHalf = "";
        String secondHalf = "";
        for (int i = 0; i < pos; i++) {
            firstHalf += this.string.charAt(i);
        }
        for (int i = pos; i < this.string.length(); i++) {
            secondHalf += this.string.charAt(i);
        }
        this.string = firstHalf + string + secondHalf;
        return this;
    }

    String build() {
        return string;
    }
}
