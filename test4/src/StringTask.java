import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {
    public static void main(String[] args) throws IOException {
        String[] words;
        String choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите минимум три слова: ");
        do {
            String input = br.readLine();
            words = input.split(",");
            if (words.length < 3) System.out.println("Вы ввели меньше 3 слов! Повторите попытку: ");
        } while (words.length < 3);
        int maxLength = 0;
        String longestString = null;
        do {
            System.out.println("Выберете фильтр: ");
            System.out.println("1 - maximum length");
            System.out.println("2 - start with");
            System.out.println("3 - end with");
            System.out.println("4 - contains");
            System.out.println("0 - exit");
            choice = br.readLine();
            if (choice.equals("0")) break;
            else if (choice.equals("1")) {
                for (String word : words) {
                    if (word.length() > maxLength) {
                        maxLength = word.length();
                        longestString = word;
                    }
                }
                System.out.println("Самое длинное слово: " + longestString);
            } else if (choice.equals("2")) {
                System.out.println("Введите текст для проверки начала: ");
                String startWith = br.readLine();
                for (String word : words) {
                    if (word.startsWith(startWith)) {
                        System.out.println("Слово '" + word + "' начинается на " + startWith);
                    }
                }
            } else if (choice.equals("3")) {
                System.out.println("Введите текст для проверки конца: ");
                String endWith = br.readLine();
                for (String word : words) {
                    if (word.endsWith(endWith)) {
                        System.out.println("Слово '" + word + "' заканчивается на " + endWith);
                    }
                }
            } else if (choice.equals("4")) {
                System.out.println("Введите текст для проверки: ");
                String part = br.readLine();
                for (String word : words) {
                    if (word.contains(part)) System.out.println("В слове " + word + " есть " + part);
                }

            } else System.out.println("Вы ввели неверный фильтр! Повторите попытку: ");
        } while (!choice.equals("0"));
    }
}
