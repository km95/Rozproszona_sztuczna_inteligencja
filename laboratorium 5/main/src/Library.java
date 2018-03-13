import book.Book;
import person.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws MyException, IOException {
        ArrayList<Book> library = new ArrayList<>();
        ArrayList<Double> rating = new ArrayList<>();
        library.add(new Book("Cyfrowa Twierdza", "Brown"));      //(add) - dodaje do listy nową pozycję
        library.add(new Book("Sześć lat później", "Coben"));
        library.add(new Book("Wstrząs", "Cook"));
        library.add(new Book("Morderca bierze wszystko", "Spindler"));
        library.add(new Book("Hobbit", "Tolkien"));
        library.add(new Book("Wiedźmin", "Sapkowski"));
        library.add(new Book("Harry Potter", "Rowling"));

        Student a = new Student("Kamil", "S");
        int control = 0;
        int request = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("1 - Pokaż książki\n2 - Pokaż moje książki\n3 - Wypożycz książkę\n4 - Oddaj książkę");
                System.out.println("5 - Przekaż ksiażke do biblioteki\n6 - Zapis książek do pliku\n7 - Odczyt książek z pliku" );
                System.out.println("8 - Dodaj ocene \n9 - Pobierz oceny i wypisz \n10- Wyjdz z biblioteki");
                control = scanner.nextInt();
                try {
                    if (control <= 0 || control >= 11) {
                        throw new MyException();
                    }
                } catch (MyException e) {
                }
            } catch (InputMismatchException e) {
                System.err.println("Podaj cyfre");
            }

            switch (control) {
                case 1:
                    for (Book result : library) {
                        result.Print();
                    }
                    break;
                case 2:
                    a.printBook();
                    break;
                case 3:
                    for (int i = 0; i < library.size(); i++) {
                        System.out.print(i + " ");
                        library.get(i).Print();
                    }
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Podaj numer książki");
                        request = scanner.nextInt();
                        if (request > library.size() || request < 0) {
                            System.err.println("Wyjście poza index");
                        } else {
                            a.AddBook(library.get(request));
                            library.remove(request);
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Podaj cyfre");
                    }
                    break;
                case 4:
                    a.printBook();
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Podaj numer książki");
                        request = scanner.nextInt();
                        if (request > a.LengthBook() - 1 || request < 0) {
                            System.err.println("Wyjście poza index");
                        } else {
                            library.add(a.DeleteBook(request));
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Podaj cyfre");
                    }
                    break;
                case 5:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Podaj nazwe książki");
                    String name = scanner.next();
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Podaj nazwe książki");
                    String author = scanner1.next();
                    library.add(new Book(name, author));
                    break;
                case 6:
                    PrintWriter pw = new PrintWriter("Ksiazki.txt");
                    for (int i = 0; i < library.size(); i++) {
                        pw.println(library.get(i).PrintS());
                    }
                    pw.close();
                    break;
                case 7:
                    FileReader fileReader = new FileReader("Ksiazki.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    try {
                        String textLine = bufferedReader.readLine();
                        do {
                            System.out.println(textLine);

                            textLine = bufferedReader.readLine();
                        } while (textLine != null);
                    } finally {
                        bufferedReader.close();
                    }
                    break;
                case 8:
                    Double rat;
                    try {
                        try {
                        Writer output = new BufferedWriter(new FileWriter("Ocena.txt", true));
                        Scanner scanner4 = new Scanner(System.in);
                        System.out.println("Podaj ocene 1-10");
                        rat = scanner4.nextDouble();


                            if (rat <= 0 || rat >= 11) {
                                throw new MyException();
                            }
                            output.append(rat.toString()+" \n");
                            output.close();
                        } catch (MyException e) {
                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Podaj cyfre");
                    }
                    break;
                case 9:

                    String nazwaPliku = "Ocena.txt";
                    rating.clear();
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(nazwaPliku));
                        String linia = null;
                        while ((linia = br.readLine()) != null) {
                            double liczba = Double.parseDouble(linia.trim());
                            rating.add(liczba);
                        }
                    } catch (Exception e) {
                        System.err.println("Wystapil blad przy wczytywaniu danych");
                        e.printStackTrace();
                    }
                    System.out.println(rating);
                    break;

            }
        } while (control != 10);

    }
}
