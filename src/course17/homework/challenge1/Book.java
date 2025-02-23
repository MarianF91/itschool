package course17.homework.challenge1;

public class Book {

    private final String title;
    private final long ISBN;
    private int copies;
    private final String publisher;
    private final Author author;

    public Book(String title, long ISBN, int copies, String publisher, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.copies = copies;
        this.publisher = publisher;
        this.author = author;
        if (author != null) {
            author.addBook(this);
        }
    }

    public String getTitle() {

        return title;
    }

    public long getISBN() {
        return ISBN;
    }

    public int getCopies() {
        return copies;
    }

    public Author getAuthor() {
        return author;
    }

    public void addCopies(int num) {
        this.copies += num;
    }

    public void removeCopies(int num) {
        if (this.copies >= num) {
            this.copies -= num;
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Number of copies: " + this.getCopies());
        if (this.author != null) {
            System.out.println("Author: ");
            this.author.displayAuthorInfo();
        } else {
            System.out.println("Author information not available.");
        }
    }
}
