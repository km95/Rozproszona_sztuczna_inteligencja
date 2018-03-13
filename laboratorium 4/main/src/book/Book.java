package book;

import java.util.Scanner;

public class Book {

    String author;
    String name;

    public Book() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj autora");
        this.author = scanner1.next();
        System.out.println("Podaj nazwe");
        this.name = scanner1.next();
    }

    public Book(String name, String author) {
        this.author = author;
        this.name = name;
    }

    public void Print() {
        System.out.println("Książka: "+ name + " " + author);
    }

}
