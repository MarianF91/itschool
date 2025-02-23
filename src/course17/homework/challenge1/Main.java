package course17.homework.challenge1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Sir Arthur Ignatius Conan Doyle", "British", "22 May 1859"
        , new ArrayList<>());
        Author author2 = new Author("Ion Creanga", "Romanian", "01 March 1837", new ArrayList<>());

        Book book1 = new Book("The Adventures of Sherlock Holmes", 12345, 5, "First Publisher", author1);
        Book book2 = new Book("Capra cu trei iezi", 45678, 7, "Second publisher", author2);

        Member member1 = new Member("First Member", "First address", "First contact", 123);
        member1.borrowBook(book1);

        Member member2 = new Member("Second Member", "Second address", "Second contact", 456);
        member2.borrowBook(book2);

        Library library = new Library();
        library.addMember(member1);
        library.addMember(member2);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.displayBooks();
        library.displayMembers();

        System.out.println("List of books borrowed by member1: ");
        member1.listOfBorrowedBooks();

        System.out.println("List of books borrowed by member2: ");
        member2.listOfBorrowedBooks();
    }
}