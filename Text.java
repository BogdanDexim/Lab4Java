import java.util.*;
/**
 * Клас для представлення тексту.
 */
class Text {
    private final List<Sentence> sentences;
    //розділення тексту на речення
    public Text(String text) {
        sentences = new ArrayList<>();
        String[] rawSentences = text.split("[.?!]\\s*");
        for (String rawSentence : rawSentences) {
            sentences.add(new Sentence(rawSentence));
        }
    }
    //Отримати список речень у тексті.
    public List<Sentence> getSentences() {
        return sentences;
    }
}