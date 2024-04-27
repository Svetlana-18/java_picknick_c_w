package picknick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 3. Вычислить частоту слов:

public class WordCountAnalysis {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            try (Scanner scanner = new Scanner(file)) {
                List<String> wordsList = new ArrayList<>();
                Map<String, Integer> wordCount = new HashMap<>();

                // // wordCount.put (): помещает в коллекцию новый объект с ключом и значением.
                // // Если в коллекции уже есть объект с подобным ключом, то он перезаписывается

                while (scanner.hasNext()) {
                    String word = scanner.next();
                    wordsList.add(word);
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
                scanner.close();
                // Метод entrySet() возвращает список всех пар в нашей HashMap

                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    System.out.println("Слово: " + entry.getKey() + " встречается - " + entry.getValue() + " раз(а);");
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }

}
