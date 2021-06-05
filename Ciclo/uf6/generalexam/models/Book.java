package cat.itb.martamacias7e4.dam.m03.uf6.generalexam.models;

public class Book {
    String title;
    String author;
    String isbn;
    int year;
    int pages;

    public Book(String title, String author, String isbn, int year, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title+" - "+author+" - "+year;
    }
}
