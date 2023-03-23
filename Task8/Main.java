import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = 0;
        int sum = 0;
        do {
            System.out.println("Введите число больше 0:");
            limit = in.nextInt();
        } while (limit <= 0);

        for (int i = 1; i < limit; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println("Сумма нечетных чисел = " + sum);
    }
}