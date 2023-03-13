import static java.lang.Character.isLetter;

public class CountWords {
    public int count(String str) {
        int words = 0;
        char last = ' ';
        for (int i = 0; i < str.length(); i++) {
            // if iterator is not at a letter
            // and the last word is 'a' or 'r'
            // increment words++
            if (!isLetter(str.charAt(i)) && (last == 'a' || last == 'r')) {
                words++;
            }
            last = str.charAt(i);
        }
        if (last == 'r' || last == 's') {
            words++;
        }
        return words;
    }

}
