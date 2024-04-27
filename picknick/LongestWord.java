package picknick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//2. Найти самое длинное слово:

public class LongestWord {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            try (Scanner scanner = new Scanner(file)) {
                String longestWord = "";

                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
                scanner.close();

                System.out.println("Самое длинное слово: " + longestWord);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }
}