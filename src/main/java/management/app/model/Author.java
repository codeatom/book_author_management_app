package management.app.model;


import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String email;
    private final List<Book> bookList = new ArrayList<>();

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBookList() {
        return new ArrayList<>(bookList);
    }

    public void addBookToList(Book book) {
        bookList.add(book);
    }

    public void removeFromBookToList(Book book) {
        bookList.remove(book);
    }

    public String getSummary() {
        return  "First Name: " + this.name +"\n"
                + "email: " + this.email +"\n";
    }

}

