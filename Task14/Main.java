import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int RANGE = 20;
        final int SIZE = 15;
        int maxElement = -RANGE;
        int minElement = RANGE;
        Integer[] elements = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            elements[i] = RANGE - random.nextInt(RANGE * 2);
            if (elements[i] > maxElement)
                maxElement = elements[i];
            if (elements[i] < minElement)
                minElement = elements[i];
        }

        for (Integer element:elements) {
            System.out.print(element + "\t");
        }
        System.out.print("\nНаибольшее по модулю: " + Math.max(Math.abs(maxElement), Math.abs(minElement)));
    }
}