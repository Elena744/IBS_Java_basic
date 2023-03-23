import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String[] words = line.split(" ");
        int count = 0;
        for (String word:words){
            if (word.matches("\\w+")){
                count++;
                System.out.print(word + "\t");
            }
        }
        System.out.print("\nВсего " + count + " слов");
    }
}