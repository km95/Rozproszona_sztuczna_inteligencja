import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateFigure {
    public static Triangle CreateTriangle() {

        Scanner scanner = new Scanner(System.in);
        Triangle ob = null;

        try {
            System.out.println("Podaj a = ");
            int a = scanner.nextInt();
            System.out.println("Podaj b = ");
            int b = scanner.nextInt();
            System.out.println("Podaj c = ");
            int c = scanner.nextInt();

            try {
                 ob = new Triangle(a, b, c);
            } catch (ArithmeticException e) {
                System.err.println("Podaj liczbe dodatnia");
            }

        } catch (InputMismatchException e) {
            System.err.println("Podaj cyfre!!!");
        }
        return ob;
    }

    public static Square CreateSquare() {

        Scanner scanner = new Scanner(System.in);
        Square ob = null;

        try {
            System.out.println("Podaj a = ");
            int a = scanner.nextInt();

            try {
                ob = new Square(a);
            } catch (ArithmeticException e) {
                System.err.println("Podaj liczbe dodatnia");
            }

        } catch (InputMismatchException e) {
            System.err.println("Podaj cyfre!!!");
        }
        return ob;
    }

    public static Circle CreateCircle() {

        Scanner scanner = new Scanner(System.in);
        Circle ob = null;

        try {
            System.out.println("Podaj r = ");
            int r = scanner.nextInt();

            try {
                ob = new Circle(r);
            } catch (ArithmeticException e) {
                System.err.println("Podaj liczbe dodatnia");
            }

        } catch (InputMismatchException e) {
            System.err.println("Podaj cyfre!!!");
        }
        return ob;
    }

}
