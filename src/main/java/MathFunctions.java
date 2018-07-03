import java.util.Scanner;

public class MathFunctions {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();

        System.out.format("%.3f%n", x); // вывод три знака после запятой
    }
}
