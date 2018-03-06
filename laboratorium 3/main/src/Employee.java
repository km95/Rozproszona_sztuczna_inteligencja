import java.util.ArrayList;

public class Employee extends Person implements Print {
    String name;
    String lastName;
    int id;
    ArrayList<Book> mybook = new ArrayList<>();

    Employee(String name,String lastName,int pesel) {
        this.name = name;
        this.lastName = lastName;
        this.id = pesel;
    }

    @Override
    public void print() {
        System.out.println("Pracownik "+name+" "+lastName+" "+id);
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
