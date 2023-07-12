public class ClassExamples {
    public static void main(String[] args) {

    }
}
    /*
Example 1 - сумма первых 5 элементов массива
        int b = 2;
        int c;
        c = ++b + 7; // сначала увеличивается b на 1, потом считается с
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("b = " + b); // b = 3
        System.out.println("c = " + c); // с = 10
        System.out.println("Сумма элементов = " + sum); // sum = 15

Example 2 - префикс/постфикс инкремент
        int a = 10;
        int b = 10;
        int d;
        int c;
        int i;
        d = a++ - 1; // сначала считаем d = 9 , потом увеличиваем a на 1
        c = ++b - 1; // cначала увеличиваем b на 1, потом считаем с = 10
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i равно: " + i);
            if (i == 2) done = true;
            i++;
        }
        System.out.println("a = " + a); // a = 11
        System.out.println("b = " + b); // b = 11
        System.out.println("d = " + d); // d = 9
        System.out.println("c = " + c); // c = 10

Example 3 - do while, логическое или
        int d = 39;
        d %= 6;
        boolean a = true;
        boolean b = false;
        boolean c = a | b; // c = true
        int n = 4;
        do {
            System.out.println("n = " + n); // 4 3 2 1
        } while (--n > 0);
        System.out.println("d = " + d); // d = 3
        System.out.println("c = " + c); // c = true

Example 4 - Ternary operator
        int i, k;
        i = 10;
        k = i < 0 ? -i : i % 3; // k = 1
        int a = 1;
        boolean done = false;
        for (int j = 1; j < 4; j++) {
            a++; // 2 3 4
            if (a > 3) done = true;
            System.out.println("done = " + done); // false false true
        }
        System.out.println("k = " + k); // k = 1
     */