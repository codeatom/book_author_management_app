package management.app.data;

import management.app.model.Author;
import management.app.model.Book;

public class BookAuthorManager {

    public Book createBook(String title, int isbn, Author author){
        Book book = new Book(title, isbn);
        book.setAuthor(author.getName());
        author.addBookToList(book);

        return book;
    }

    public boolean RemoveBook(Author author, Book bookToRemove){
        for (Book book : author.getBookList() ){
            if(book.getISBN() == bookToRemove.getISBN()){
                author.removeFromBookToList(book);

                return true;
            }
        }

        return  false;
    }

}
