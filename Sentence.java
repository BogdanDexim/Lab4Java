/**
 * Клас для представлення речення.
 */
import java.util.*;
class Sentence {
    private final List<Object> elements;
    //конструктор для ініціалізації речення.
    public Sentence(String sentence) {
        elements = new ArrayList<>();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                //Додаємо слово без розділових знаків
                String cleanWord = word.replaceAll("[^a-zA-Zа-яА-ЯєЄіїІїґҐ]", "");
                if (!cleanWord.isEmpty()) {
                    elements.add(new Word(cleanWord));
                }
            }
        }
    }

    public List<Object> getElements() {
        return elements;
    }
}
