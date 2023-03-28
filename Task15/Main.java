import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара:");
        double course = in.nextDouble();
        System.out.println("Количество рублей:");
        double rub = in.nextDouble();
        System.out.println("Итого: " + String.format("%.2f", rub / course) + " долларов");
    }
}