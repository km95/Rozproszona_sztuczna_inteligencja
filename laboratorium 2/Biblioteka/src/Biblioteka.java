import java.util.Arrays;
import java.util.Scanner;

public class Biblioteka {

    public static void main(String[] args) {
        byte b = 0;
        boolean zamek = true;
        char znak = 'A';
        float f = 9.9f;
        double d = 11.98;
        int a = 1;
        int wybor;
        System.out.println("byte b = " + b + "\nboolean zamek = " + zamek + "\nchar znak = "
                + znak + "\nfloat f = " + f + "\ndouble d = " + d + "\nint a = " + a);


        System.out.println();

        if (zamek) {
            System.out.println("Biblioteka otwarta");
            System.out.println("Podaj polke od 1 do 5 ");
            Scanner odczyt = new Scanner(System.in);
            wybor = odczyt.nextInt();
            wybor_polki(wybor);
        }
        else
            System.out.println("Biblioteka zamknieta");

        for (int i = 0; i<10;i++)
            System.out.println(i);

        System.out.println();
        System.out.println("tablica jednowymiarowa");
        int[] tablica_int = new int[20];

        for (int i = 0; i < 20; i++) {
            tablica_int[i] = i;
        }

        System.out.println(Arrays.toString(tablica_int));

        System.out.println("tablica wielowymiarowa");
        int[][] tab_in = new int[10][10];
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < 10; j++) {
                tab_in[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print(tab_in[i][j]+"    ");
            }
            System.out.println();
        }
    }

    static void wybor_polki (int wybor)
    {
        switch (wybor) {
            case 1:
                System.out.println("polka numer 1 ");
                break;
            case 2:
                System.out.println("polka numer 2 ");
                break;
            case 3:
                System.out.println("polka numer 3 ");
                break;
            case 4:
                System.out.println("polka numer 4 ");
                break;
            case 5:
                System.out.println("polka numer 5 ");
                break;
        }
    }


}
