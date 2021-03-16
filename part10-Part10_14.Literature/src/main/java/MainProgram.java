
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecomendation = Integer.valueOf(scanner.nextLine());
            books.add(new Book(bookName, ageRecomendation));
        }
        System.out.println("\n" + books.size() + " books in total.");
        System.out.println("\n" + "Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecomendedAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        books.forEach((book) -> {
            System.out.println(book.toString());
        });
    }

}
