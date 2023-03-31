import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        int y = 0;
        double number = 0;
        double result1 = 0, result2 = 0, result3 = 0, result4 = 0;
        if (x == 1) {
            System.out.println("Выберете единицу массы: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            y = in.nextInt();
            System.out.println("Введите число: ");
            number = in.nextDouble();
            switch (y){
                case (1):
                    result1 = number;
                    result2 = number / 1000;
                    result3 = result2 / 100;
                    result4 = result3 / 10;
                    break;
                case (2):
                    result1 = number * 1000;
                    result2 = number;
                    result3 = result2 / 100;
                    result4 = result3 / 10;
                    break;
                case (3):
                    result1 = number * 10000;
                    result2 = number * 10;
                    result3 = number;
                    result4 = result3 / 10;
                    break;
                case (4):
                    result1 = number * 1000000;
                    result2 = number * 1000;
                    result3 = number * 10;
                    result4 = number;
                    break;
                default: {
                    System.out.println("Ошибка ввода единицы массы");
                    System.exit(0);
                }
            }
            System.out.println("Результат:");
            System.out.println("Грамм: " + result1);
            System.out.println("Килограмм: " + result2);
            System.out.println("Центнер: " + result3);
            System.out.println("Тонна: " + result4);
        }
        else if(x == 2)  {
            System.out.println("Выберете единицу измерения: 1 - сантиметр, 2 - дециметр, 3 - метр, 4 - километр");
            y = in.nextInt();
            System.out.println("Введите число: ");
            number = in.nextDouble();
            switch (y){
                case (1):
                    result1 = number;
                    result2 = number / 10;
                    result3 = result2 / 10;
                    result4 = result3 / 1000;
                    break;
                case (2):
                    result1 = number * 10;
                    result2 = number;
                    result3 = result2 / 10;
                    result4 = result3 / 1000;
                    break;
                case (3):
                    result1 = number * 100;
                    result2 = number * 10;
                    result3 = number;
                    result4 = result3 / 1000;
                    break;
                case (4):
                    result1 = number * 100000;
                    result2 = number * 10000;
                    result3 = number * 1000;
                    result4 = number;
                    break;
                default: {
                    System.out.println("Ошибка ввода единицы измерения");
                    System.exit(0);
                }
            }
            System.out.println("Результат:");
            System.out.println("Сантиметр: " + result1);
            System.out.println("Дециметр: " + result2);
            System.out.println("Метр: " + result3);
            System.out.println("Километр: " + result4);
        }
        else{
            System.out.println("Ошибка ввода");
            System.exit(0);
        }
    }
}
