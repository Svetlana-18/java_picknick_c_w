package picknick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 2. Нахождение самого длинного слова
//  Исключить непредвиденную ситуацию, использую блоки try-catch.
public class LongestWord {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            try (Scanner scanner = new Scanner(file)) {
                String longestWord = "";

                // пока работает scanner и не достигнут конец коллекции в блоке if проверяю
                // длину встречающихся слов, и присваиваю longestWord самое длинное
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
                scanner.close();

                // вывод на печать
                System.out.println("Самое длинное слово: " + longestWord);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }
}