package picknick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Вычисление частоты слов

public class WordCountAnalysis {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            List<String> wordsList = new ArrayList<>();
            Map<String, Integer> wordCount = new HashMap<>();

            // пока работает scanner и не достигнут конец коллекции,
            // Добавляю слово в map wordCount. И при помощи использования put добавляю
            // ключ/значение
            // , а getOrDefault позволяет увеличить количество вхождений слова.

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordsList.add(word);
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            scanner.close();

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println("Слово: " + entry.getKey() + " встречается - " + entry.getValue() + " раз(а);");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }

}
