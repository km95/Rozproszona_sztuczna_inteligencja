import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book(1,"Cyfrowa Twierdza","Brown"));      //(add) - dodaje do listy nową pozycję
        library.add(new Book(2,"Sześć lat później","Coben"));
        library.add(new Book(3,"Wstrząs", "Cook"));
        library.add(new Book(4,"Morderca bierze wszystko","Spindler"));
        library.add(new Book(5,"Hobbit", "Tolkien"));
        library.add(new Book(6,"Wiedźmin", "Sapkowski"));
        library.add(new Book(7,"Harry Potter", "Rowling"));
        Student r = new Student("Tomek","Tom");
        Employee a = new Employee("Kamil","S",1);
        r.addBook(library.get(4));
        r.printBook();
        a.addBook(library.get(1));
        a.printBook();

    }
}
