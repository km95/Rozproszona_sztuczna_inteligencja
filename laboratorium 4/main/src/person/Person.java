package person;

import book.Book;

public abstract class Person {
    public abstract void AddBook(Book book);
    public abstract Book DeleteBook(int index);
    public abstract int LengthBook();
}
