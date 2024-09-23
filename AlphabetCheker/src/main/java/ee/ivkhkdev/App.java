package ee.ivkhkdev;

import java.util.HashSet;
import java.util.Set;

public class App {

    public void run() {
        String text = "Съеь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";

        if (containsAllRussianLetters(text)) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }
    }

    public static boolean containsAllRussianLetters(String text) {

        text = text.toLowerCase().replaceAll("[^а-яё]", "");

        String missingLetters = "";

        for (char letter = 'а'; letter <= 'я'; letter++) {
            if (!text.contains(String.valueOf(letter))) {
                missingLetters += letter + (" ");


            }
        }


        if (!text.contains("ё")) {
            missingLetters += "ё ";
        }
        if (missingLetters.length() > 0) {
            System.out.println("Отсутствующие буквы: " + missingLetters.toString().trim());
            return false;

        }
        return true;
    }
}