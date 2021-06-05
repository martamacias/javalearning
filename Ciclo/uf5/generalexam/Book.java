package cat.itb.martamacias7e4.dam.m03.uf5.generalexam;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    String isbn;
    int pages;
    int year;

    public Book(String title, String author, String isbn, int pages, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.year = year;
    }

    public static Book readBook(Scanner scanner) {
        scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        String isbn = scanner.nextLine();
        int pages = scanner.nextInt();
        int year = scanner.nextInt();
        return new Book(title, author, isbn, pages, year);
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

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", title, author, year);
    }

    public void printTitle() {
        System.out.println(title);
    }
}
