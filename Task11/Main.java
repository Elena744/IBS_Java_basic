import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        String firstNumber = in.next();

        System.out.println("Введите второе число:");
        int secondNumber = in.nextInt();

        double transformationFirstNumber = Double.parseDouble(firstNumber);
        double transformationSecondNumber = secondNumber;
        if (transformationFirstNumber > transformationSecondNumber)
            System.out.println(transformationFirstNumber + "\t" + transformationSecondNumber);
        else
            System.out.println(transformationSecondNumber + "\t" + transformationFirstNumber);
    }
}