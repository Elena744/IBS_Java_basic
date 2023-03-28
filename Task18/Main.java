import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        final String KEY = "Заархивированный вирус";
        final String HELP = "Подсказка";
        boolean useHelp = true;
        int attempt = 3;
        String answer;
        while (attempt > 0){
            System.out.println("Ответ: ");
            answer = in.nextLine();
            switch (answer) {
                case KEY:
                    System.out.println("Правильно!");
                    System.exit(0);
                case HELP:{
                    if (useHelp)
                        System.out.println("Подсказка сработала!");
                    else
                        System.out.println("Подсказка уже недоступна");
                    break;}
                default:
                    System.out.println("Подумай еще!");
            }
            attempt--;
            useHelp = false;
        }
        System.out.println("Обидно, приходи в другой раз");
    }
}