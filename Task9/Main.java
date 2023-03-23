import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;
        double averageSum = 0;
        do {
            System.out.println("Введите размерность массива (число больше 0):");
            size = in.nextInt();
        } while (size <= 0);

        double[] mass = new double[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("число[" + i + "]=");
            mass[i - 1] = in.nextDouble();
            averageSum += mass[i - 1];
        }
        averageSum /= size;
        for (double number:mass){
            System.out.print(number * averageSum + "  ");
        }
    }
}