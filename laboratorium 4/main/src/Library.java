import book.Book;
import person.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) throws MyException {
        ArrayList<Book> library = new ArrayList<>();
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
                System.out.println("1 - Pokaż książki\n2 - Pokaż moje książki\n3 - Wypożycz książkę\n4 - Oddaj książkę\n5- Wyjdz z biblioteki ");
                control = scanner.nextInt();
                try {
                    if (control <= 0 || control >= 6) {
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
                        if (request > library.size() || request < 0){
                            System.err.println("Wyjście poza index");
                        }else{
                            a.AddBook(library.get(request));
                            library.remove(request);
                        }
                    }catch (InputMismatchException e){
                        System.err.println("Podaj cyfre");
                    }
                    break;
                case 4:
                    a.printBook();
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Podaj numer książki");
                        request = scanner1.nextInt();
                        if (request > a.LengthBook()-1 || request < 0){
                            System.err.println("Wyjście poza index");
                        }else {
                            library.add(a.DeleteBook(request));
                        }
                    }catch (InputMismatchException e){
                        System.err.println("Podaj cyfre");
                    }
                    break;
            }
        } while (control != 5);

    }
}
