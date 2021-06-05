package cat.itb.martamacias7e4.dam.m03.uf5.generalexam;

import java.util.*;

public class SearchByISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Book> books = getBooks(scanner);
        List<String> isbnList = isbnBooks(scanner, books);
        searchBooks(books, isbnList);
    }

    private static void searchBooks(Map<String, Book> books, List<String> isbnList) {
        for (String code: isbnList){
            boolean exist = books.containsKey(code);
            if (exist){
                Book book = books.get(code);
                System.out.println(book.toString());
            }else {
                System.out.println("Not Found");
            }
        }
    }

    private static List<String> isbnBooks(Scanner scanner, Map<String, Book> books) {
        List<String> isbnList = new ArrayList<>();
        int quant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quant; i++) {
            String isbn = scanner.nextLine();
            isbnList.add(isbn);
        }
        return isbnList;
    }


    private static Map<String, Book> getBooks(Scanner scanner) {
        Map<String, Book> books = new HashMap<>();
        int quant = scanner.nextInt();
        for (int i = 0; i < quant; i++) {
            Book book = Book.readBook(scanner);
            String isbn = book.getIsbn();
            books.put(isbn, book);
        }
        return books;
    }
}
