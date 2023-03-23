import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final char X = 'x';
        final char Y = 'y';
        final char Z = 'z';
        Scanner in = new Scanner(System.in);
        int size = 0;
        do {
            System.out.println("Введите размерность массива (число больше 0):");
            size = in.nextInt();
        } while (size <= 0);

        char[] word = new char[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("символ[" + i + "]=");
            word[i - 1] = in.next().charAt(0);
        }

        for (char symbol:word){
            if ((symbol == X) || (symbol == Y) || (symbol == Z)) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}