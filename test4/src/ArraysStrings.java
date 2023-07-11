import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysStrings {
    public static void main(String[] args) {

    }
}
     /*
Example 1
        int month_days[]; //объявление
        month_days = new int [12]; //инициализация
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        System.out.println("В апреле " + month_days[3] + " дней."); // 30

Example 2
        int month_days[] = {31, 28, 31, 30, 31};
        System.out.println("В апреле " + month_days[3] + " дней."); // 30

Example 3 - Среднее значение элементов массива
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Среднее значение равно " + result / 5);

Example 4 - Двумерный массив
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }

Example 5 - Создание строк
        String str1 = "Первая строка";
        String str2 = new String("Вторая строка");
        String str3 = new String(); //объект str3 сейчас null, дефолтное значение для ссылочных типов(объектов)
        str3 = "Третья строка";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

Example 6 - Сцепление строк
        String str[] = {"один", "два", "три"};
        String longStr = "Это может быть реально очень "
                + "длинная строка, которую надо "
                + "перенести на новую строку."
                + "Но блягодарая сцеплению "
                + "этого можно избежать.";
        for (int i = 0; i < str.length; i++) System.out.println("str[" + i + "] " + str[i]);
        System.out.println(longStr);

Example 7 - Длинна строки
        String s = "string length";
        System.out.println(s.length());
        System.out.println("string".length());

Example 8 - Извлечь один символ из строки
        char ch;
        String s = "adcd e";
        ch = s.charAt(1);
        System.out.println(ch);

Example 9 - Сравнение строк
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Прощай";
        String s4 = "ПРИВЕТ";
        System.out.println(s1 + " равно " + s2 + " " + s1.equals(s2));
        System.out.println(s1 + " равно " + s3 + " " + s1.equals(s3));
        System.out.println(s1 + " равно " + s4 + " " + s1.equals(s4));
        System.out.println(s1 + " равно без учета регистра " + s4 + " " + s1.equalsIgnoreCase(s4));

Example 10 .startsWith() .endsWith()
        String s1 = "foobar";
        String s2 = "endless string";
        System.out.println(s1 + " заканчивается на bar " + " " + s1.endsWith("bar")); // true
        System.out.println(s1 + " начинается на bar " + " " + s1.startsWith("bar")); // false
        System.out.println(s2 + " начинается на end " + " " + s2.startsWith("end")); // true
        System.out.println(s2 + " начинается на str на 8 символе " + " " + s2.startsWith("str", 8)); // true

Example 11 .indexOf() .lastIndexOf()
        String s = "Now is the time for all good men to come to the aid of their country.";
        System.out.println(s);
        System.out.println("indexOf('sdfsdf') = " + s.indexOf("sdfsdf")); // -1
        System.out.println("indexOf(t) = " + s.indexOf('t')); // 7
        System.out.println("lastindexOf(t) = " + s.lastIndexOf('t')); // 65
        System.out.println("indexOf(the) = " + s.indexOf("the")); // 7
        System.out.println("lastindexOf(the) = " + s.lastIndexOf("the")); // 55
        System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10)); // 11
        System.out.println("lastindexOf(t, 60) = " + s.lastIndexOf('t', 60)); // 55
        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10)); // 44
        System.out.println("lastindexOf(the, 60) = " + s.lastIndexOf("the", 60)); // 55

Example 12 - .substring() заменить одну подстроку на другую
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        String form = org.substring(16);
        System.out.println(form);
        String form2 = org.substring(0, 6);
        System.out.println(form2);
        int i;
        do { // заменить is на was
            System.out.println(org);
            i = org.indexOf(search); // номер символа с которого начинается is в строке org
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);

Example 13 .replace()
        String org = "This is a test. This is, too.";
        String newOrg1 = org.replace('i', ' ');
        String newOrg2 = "This is a test".replace('s', 'a');
        System.out.println(newOrg1);
        System.out.println(newOrg2);

Example 14
        //создать буферизованный поток чтения данных типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите стоп для завершения.");
        System.out.println("Введите название штата: ");
        do {
            str = br.readLine();
            str = str.trim(); //удалить пробелы
            if (str.equals("Иллинойс"))
                System.out.println("Столица - Спрингфилд");
            else if (str.equals("Миссури"))
                System.out.println("Столица - Джефферсон-Сити");
            else if (str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто");
            else if (str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия");
        } while (!str.equals("стоп"));

Example 15 .toUpperCase() .toLowerCase()
        String s = "Это Тестовая Строка.";
        System.out.println("Исходная строка: " + s);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Верхний регистр: " + upper);
        System.out.println("Нижний регистр: " + lower);

Example 16 .contains()
        String s = "Это тест. Новая строка";
        System.out.println("Исходная строка: " + s);
        System.out.println("Строка содержит 'тест': " + s.contains("тест"));
        System.out.println("Строка содержит 'новая': " + s.contains("новая"));

Example 17 - Разница '==' и '.equals()'
        String s1 = "Привет";
        String s2 = new String(s1);
        System.out.println(s1 + " равно " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));

Example 18 - main() args
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
            Edit configurations -> arguments
      */

