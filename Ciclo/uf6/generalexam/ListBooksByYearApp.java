package cat.itb.martamacias7e4.dam.m03.uf6.generalexam;

import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data.BookDAO;
import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data.DatabaseLibrary;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class ListBooksByYearApp {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        DatabaseLibrary database = new DatabaseLibrary();
        try(Connection connection = database.connect()) {
            BookDAO bookDAO = new BookDAO(database);
            System.out.print("Escriu un any: ");
            int yearBook = scanner.nextInt();
            System.out.println("## Books For Year "+yearBook);
            bookDAO.listBooksYear(yearBook).forEach(System.out::println);
        }
    }
}
