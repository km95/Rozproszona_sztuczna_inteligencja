import java.util.ArrayList;

public class Student extends Person implements Print{
    String name;
    String lastName;
    ArrayList<Book> mybook = new ArrayList<>();

    Student(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void print() {
        System.out.println("Czytelnik "+name+" "+lastName);
    }

    @Override
    public void printBook() {
        for (Book wartosc:mybook) {
            wartosc.print();
        }
        System.out.println();
    }

    @Override
    public void addBook(Book book) {
        mybook.add(book);
    }
}
