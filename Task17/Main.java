import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int count = in.nextInt();

        String[] text = new String[count];
        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            text[i] = in.next();
            System.out.println();
        }
        result = text.clone();
        for (int i = 0; i < count; i++){
            text[i] = new StringBuilder(new StringBuilder(text[i]).reverse().toString().replaceAll("(.)(?=.*\\1)","")).reverse().toString();
        }
        int maxLength = 0;
        int position = -1;
        for (int i = 0; i < count; i++){
            if (text[i].length() > maxLength){
                maxLength = text[i].length();
                position = i;
            }
        }
        System.out.println("Ответ: " + result[position]);
    }
}