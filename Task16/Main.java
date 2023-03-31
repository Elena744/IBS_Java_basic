import java.util.Scanner;
 public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Ввод:");
            String equation = in.next();
            int x = equation.indexOf("x");
            int result = 0;

            //Character action = equation.charAt(1);
            //if (action.equals("-")) {
            if (equation.charAt(1) == '-') {
                switch (x) {
                    case 0:
                        result = Character.getNumericValue(equation.charAt(2)) + Character.getNumericValue(equation.charAt(4));
                        break;
                    case 2:
                        result = Character.getNumericValue(equation.charAt(0)) - Character.getNumericValue(equation.charAt(4));
                        break;
                    case 4:
                        result = Character.getNumericValue(equation.charAt(0)) - Character.getNumericValue(equation.charAt(2));
                        break;
                }
            }
            else if (equation.charAt(1) == '+'){
                switch (x) {
                    case 0:
                        result = Character.getNumericValue(equation.charAt(4)) - Character.getNumericValue(equation.charAt(2));
                        break;
                    case 2:
                        result = Character.getNumericValue(equation.charAt(4)) - Character.getNumericValue(equation.charAt(0));
                        break;
                    case 4:
                        result = Character.getNumericValue(equation.charAt(0)) + Character.getNumericValue(equation.charAt(2));
                        break;
                }
            }
            else {
                System.out.println("Данные введены неверно");
                System.exit(0);
            }
            System.out.println("Вывод: " + result);
        }
    }