package Aggregation;

public class Aggregation {
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" relationship between objects.
        // One object contains another object as part of its structure,
        // but the contained object/s can exist independently.

        Book book1 = new Book("Siddartha", 200);
        Book book2 = new Book("Frankestein", 150);
        Book book3 = new Book("Harry Potter", 1000);

        Book[] books = { book1, book2, book3 };
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }

        Library library = new Library("NYC public library", 1897, books); // This is aggregation, our library object has
                                                                          // books objects.

        library.displayInfo();
    }
}
