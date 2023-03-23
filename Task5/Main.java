import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        System.out.println("Введите y: ");
        double y = in.nextDouble();
        System.out.println("Введите действие: ");
        char action = in.next().charAt(0);
        switch (action) {
            case  ('+'):
                System.out.println(x + y);
                break;
            case ('-'):
                System.out.println(x - y);
                break;
            case ('*'):
                System.out.println(x * y);
                break;
            case ('/'):
                System.out.println((y == 0) ? "на 0 делить нельзя" : (x / y));
                break;
            default:
                System.out.println("Действие не известно");
                break;
        }
    }
}
