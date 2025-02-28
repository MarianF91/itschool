package course17.homework.challenge1;

import java.util.List;

public class Author {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private List<Book> writtenBooks;

    public Author(String name, String nationality, String dateOfBirth, List<Book> writtenBooks) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.writtenBooks = writtenBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Book> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(List<Book> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }

    public void addBook(Book book) {
        this.writtenBooks.add(book);
    }

    public void removeBook(Book book) {
        this.writtenBooks.remove(book);
    }

    public void displayAuthorInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Nationality: " + this.nationality);
        System.out.println("Date of Birth: " + this.dateOfBirth);
        System.out.println("Written Books: ");
        for (Book book : this.writtenBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}