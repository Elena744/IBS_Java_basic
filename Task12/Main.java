import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        boolean subline = line.contains("Java");
        boolean startLine = line.startsWith("I like");
        boolean endLine = line.endsWith("!!!");

        if (subline && startLine && endLine)
            System.out.println(line.toUpperCase());

        line = line.replaceAll("a", "o");
        int result = line.indexOf("Jovo");
        if (result > -1)
            System.out.println(line.substring(result, result + 4));
    }
}