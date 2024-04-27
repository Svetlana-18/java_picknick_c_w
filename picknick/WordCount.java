package picknick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//  1. Осуществить подсчет слов:

public class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            try (Scanner scanner = new Scanner(file)) {
                int wordCount = 0;
                while (scanner.hasNext()) {
                    scanner.next();
                    wordCount++;

                }
                scanner.close();
                System.out.println("Количество слов в файле input.txt: " + wordCount);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }

}
