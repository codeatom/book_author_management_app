package management.app.model;

public class Book {
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, int ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return  "title: " + title + "\n" +
                "author: " + author + "\n" +
                "SBN: " + ISBN;
    }
}

