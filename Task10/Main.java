import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        do {
            System.out.println("Введите количество строк больше 0:");
            rows = in.nextInt();
        } while (rows <= 0);
        do {
            System.out.println("Введите количество столбцов больше 0:");
            columns = in.nextInt();
        } while (columns <= 0);

        int[][] mass = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("массив[" + i + "][" + j + "] =");
                mass[i][j] = in.nextInt();
            }
        }
        System.out.print("массив[0]= {");
        for (int number:mass[0]){
            System.out.print(number * 3  + ",\t");
        }
        System.out.print("\b\b}");
    }
}