import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int pom = 0;
        do {
            System.out.println("Menu: \n1 - Trojkat\n2 - Kwadrat\n3 - Kolo\n4 - Wyjscie");
            try {
                Scanner scanner = new Scanner(System.in);
                pom = scanner.nextInt();

                switch (pom) {
                    case 1:
                        try {
                            Triangle ob = CreateFigure.CreateTriangle();
                            ob.print();
                        }catch (NullPointerException e){}
                        break;
                    case 2:
                        try {
                            Square ob = CreateFigure.CreateSquare();
                            ob.print();
                        }catch (NullPointerException e){}
                        break;
                    case 3:
                        try {
                            Circle ob = CreateFigure.CreateCircle();
                            ob.print();
                        }catch (NullPointerException e){}
                        break;

                    case 4:
                        System.out.println("Zamykanie");
                        break;

                    default:
                        System.out.println("Nie ma takiej opcji");
                }

            } catch (InputMismatchException e) {
                System.err.println("Podaj cyfre!!!");
            }
        } while (pom != 4);
    }
}
