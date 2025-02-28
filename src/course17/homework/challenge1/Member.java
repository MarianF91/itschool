package course17.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private final String address;
    private final String contact;
    private final int id;
    private final List<Book> borrowedBooks;

    public Member(String name, String address, String contact, int id) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public int getId() {
        return id;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void listOfBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println("Book: " + book.getTitle());
            if(book.getAuthor() != null){
                System.out.println("Author: " + book.getAuthor().getName());
            }
            System.out.println();
        }
    }

    public boolean overdueBooks() {
        return false;
    }
}