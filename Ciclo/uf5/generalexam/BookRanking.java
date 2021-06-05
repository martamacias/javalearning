package cat.itb.martamacias7e4.dam.m03.uf5.generalexam;

import java.util.*;

public class BookRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = readBooks(scanner);
        //1. Llibre amb més pàgines
        maxPages(books);
        //2. Llibres per any
        yearBooks(books);
        //3. Mitjana de pàgines
        avgPages(books);
        //4. Llibres publicats després del 2018
        books2018(books);
        //5. Suma de anys per pàgines
        yearsPagesSum(books);
        //6. Més de 100 pàgines
        more100pages(books);
    }

    private static void more100pages(List<Book> books) {
        System.out.println("### Més de 100 pàgines");
        books.stream()
                .filter(book -> book.getPages()>100)
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(Book::printTitle);
    }

    private static void yearsPagesSum(List<Book> books) {
        System.out.println("### Suma de anys per pàgines");
        int total = books.stream().mapToInt(book -> (book.getPages()*book.getYear())).sum();
        System.out.println(total);
        System.out.println();
    }

    private static void books2018(List<Book> books) {
        System.out.println("### Llibres publicats després del 2018");
        books.stream().filter(book -> book.getYear()>2018).forEach(System.out::println);
        System.out.println();
    }

    private static void avgPages(List<Book> books) {
        System.out.println("### Mitjana de pàgines");
        double avg = books.stream().mapToDouble(Book::getPages).average().getAsDouble();
        System.out.printf("%.1f%n", avg);
        System.out.println();
    }

    private static void yearBooks(List<Book> books) {
        System.out.println("### Llibres per any");
        books.stream()
                .sorted(Comparator.comparing(Book::getYear).reversed().thenComparing(Book::getTitle))
                .forEach(System.out::println);
        System.out.println();
    }

    private static void maxPages(List<Book> books) {
        Book book = Collections.max(books, Comparator.comparing(Book::getPages));
        System.out.println("### Llibre amb més pàgines");
        System.out.println(book.toString());
        System.out.println();
    }

    private static List<Book> readBooks(Scanner scanner) {
        List<Book> books = new ArrayList<>();
        int quant = scanner.nextInt();
        for (int i = 0; i < quant; i++) {
            Book book = Book.readBook(scanner);
            books.add(book);
        }
        return books;
    }
}
