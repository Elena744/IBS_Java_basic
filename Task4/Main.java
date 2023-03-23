import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y, z, average;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        x = in.nextDouble();
        System.out.println("Введите y: ");
        y = in.nextDouble();
        System.out.println("Введите z: ");
        z = in.nextDouble();
        average = (x + y + z) / 3;
        System.out.println("Среднее: " + average);
        if (Math.floor(average / 2) > 3)
            System.out.println("Программа выполнена корректно");
    }
}
