public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 2, 0, 4, -5};
        int buf = mass[mass.length-1];
        mass[mass.length-1] = mass[0];
        mass[0] = buf;
        System.out.println(((double)(mass[0] + mass[mass.length/2])) / 2);
    }
}
