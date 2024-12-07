/**
 * Головний клас програми для аналізу тексту.
 * Програма обчислює кількість речень, які містять однакові слова.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Текст для аналізу
        StringBuffer TextBuffer = new StringBuffer("Це перше речення. Це друге речення, з комою після спільного слова. Третє речення чи не речення? У цьому рядку теж є слово 'речення'. А ось тут немає!");


        //Замінa табуляції та зайві пробіли одним пробілом
        Text text = new Text(TextBuffer.toString().replaceAll("\\s+", " "));

        //Зберігаємо кількість повторень кожного слова
        Map<String, Integer> commonWordsCount = new HashMap<>();
        for (Sentence sentence : text.getSentences()) {
            Set<String> wordsInSentence = new HashSet<>();
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    Word word = (Word) element;
                    wordsInSentence.add(word.toString().toLowerCase());
                }
            }
            for (String word : wordsInSentence) {
                commonWordsCount.put(word, commonWordsCount.getOrDefault(word, 0) + 1);
            }
        }

        //Знаходимо найбыльшу кількість повторень
        int maxCount = commonWordsCount.values().stream().max(Integer::compareTo).orElse(0);

        //Вивід результату
        System.out.println("Найбільша кількість речень з однаковими словами: " + maxCount);
    }
}