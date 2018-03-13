package person;

import book.Book;

import java.util.ArrayList;

public class Student extends Person implements Print {
    String name;
    String lastName;
    ArrayList<Book> mybook = new ArrayList<>();

    public Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void print() {
        System.out.println("Czytelnik "+name+" "+lastName);
    }

    @Override
    public void printBook() {
        for (int i = 0; i <mybook.size() ; i++) {
            System.out.print(i+" ");
            mybook.get(i).Print();
        }
        System.out.println();
    }

    @Override
    public void AddBook(Book book)  {
        mybook.add(book);
    }

    @Override
    public Book DeleteBook(int index) {

        return mybook.remove(index);
    }

    @Override
    public int LengthBook() {
        return mybook.size();
    }
}
