package cat.itb.martamacias7e4.dam.m03.uf6.generalexam;

import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data.BookDAO;
import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data.DatabaseLibrary;
import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.models.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DatabaseLibrary database = new DatabaseLibrary();
        try(Connection connection = database.connect()) {
            BookDAO bookDAO = new BookDAO(database);
            Book book = getNewBook(scanner);
            bookDAO.insertBook(book);
            System.out.println("## Book inserted");
        } catch (SQLException throwables) {
            System.out.println("Error: El llibre ja existeix!");
        }

    }

    private static Book getNewBook(Scanner scanner) {
        System.out.println("Insertar un nou libre amb atributs:");
        System.out.println("Títol, Autor/a, ISBN, Any, Pàgines");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        String isbn = scanner.nextLine();
        int year = scanner.nextInt();
        int pages = scanner.nextInt();
        return new Book(title, author, isbn, year, pages);
    }
}
