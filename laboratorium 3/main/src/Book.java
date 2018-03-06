public class Book {
    int number;
    String author;
    String name;
    Book(int number, String author, String name)
    {
        this.number = number;
        this.author = author;
        this.name = name;
    }
    void print()
    {
        System.out.println("Książka nr: " +number +" "+author+" " +name);
    }
}
