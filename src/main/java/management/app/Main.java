package management.app;

import management.app.data.BookAuthorManager;
import management.app.model.Author;
import management.app.model.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Book Author Management App Demo");
        System.out.println("");

        BookAuthorManager bookAuthorManager = new BookAuthorManager();

        Author authorA = new Author("Christopher Ojaide", "chris@email.com");

        Book book_1 = bookAuthorManager.createBook("The Lexicon Training", 10188 , authorA);
        Book book_2 = bookAuthorManager.createBook("Exercise from Lexicon", 20335, authorA);
        Book book_3 = bookAuthorManager.createBook("Lexicon students", 312411, authorA);

        Author authorB = new Author("Lucky Patrick", "lucky@mail.com");

        Book book_4 = bookAuthorManager.createBook("The unemployment board", 490454  , authorB);
        Book book_5 = bookAuthorManager.createBook("Java and Spring at Lexicon", 522335,  authorB);

        for (Book book : authorA.getBookList() ){
            System.out.println("Information of a book from the author " + "\"" + authorA.getName() + "\"");
            System.out.println(book.toString());
            System.out.println("");
        }

        bookAuthorManager.RemoveBook(authorA,book_2);

        System.out.println("The author " + authorA.getName() + "'s" + " books list now contains " + authorA.getBookList().size() + " books");
        System.out.println("");

        for (Book book : authorB.getBookList() ){
            System.out.println("Information of a book from the author " + "\"" + authorB.getName() + "\"");
            System.out.println(book.toString());
            System.out.println("");
        }
    }
}