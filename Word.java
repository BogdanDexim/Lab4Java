/**
 * Клас для представлення слова.
 */
import java.util.*;
class Word {
    private final List<Letter> letters;
    //конструктор для слова.
    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }
    //текстове представлення слова.
    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.getValue());
        }
        return word.toString();
    }
}
