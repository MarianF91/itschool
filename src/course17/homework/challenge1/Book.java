package course17.homework.challenge1;

public class Book {

    private String title;
    private long ISBN;
    private int copies;
    private String publisher;
    private Author author;

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

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void addCopies(int num) {
        this.copies += num;
    }

    public void removeCopies(int num) {
        if (this.copies >= num) {
            this.copies -= num;
        }
    }

    public boolean isAvailable() {
        return this.copies > 0;
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
