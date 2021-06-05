package cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data;

import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.models.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    DatabaseLibrary database;

    public BookDAO(DatabaseLibrary database) {
        this.database = database;
    }
    public List<Book> listBooksYear(int year) throws SQLException {
        String query = "select * from book where year = "+year;
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return toBookList(resultSet);
    }

    private List<Book> toBookList(ResultSet resultSet) throws SQLException {
        List<Book> books = new ArrayList<>();
        while (resultSet.next()){
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            String isbn = resultSet.getString("isbn");
            int year = resultSet.getInt("year");
            int pages = resultSet.getInt("pages");
            books.add(new Book(title, author, isbn, year, pages));
        }
        return books;
    }

    public void insertBook(Book book) throws SQLException {
        String query = "insert into book values (?, ?, ?, ?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        statement.setString(1, book.getTitle());
        statement.setString(2, book.getAuthor());
        statement.setString(3, book.getIsbn());
        statement.setInt(4, book.getYear());
        statement.setInt(5, book.getPages());
        statement.execute();
    }

    public Book getLongestBook() throws SQLException {
        Book book = null;
        String query = "select * from book where pages = (select max(pages) from book)";
        Statement statement = database.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            String isbn = resultSet.getString("isbn");
            int year = resultSet.getInt("year");
            int pages = resultSet.getInt("pages");
            book = new Book(title, author, isbn, year, pages);
        }
        return book;
    }
}
