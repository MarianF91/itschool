package course17.homework.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;
    List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBookToLibrary(Book book) {
        this.books.add(book);
    }

    public void removeBookFromLibrary(Book book) {
        this.books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public Book searchByISBN(long ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                return book;
            }
        }
        return null;
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMember(Member member) {
        this.members.remove(member);
    }

    public void displayMembers() {
        for (Member member : members) {
            System.out.println("\nName: " + member.getName() + "\nID: " + member.getId() +
                    "\nAddress: " + member.getAddress() + "\nContact: " + member.getContact());
        }
    }

    public Member searchById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    public Member searchByName(String name) {
        for (Member member : members){
            if(member.getName().equalsIgnoreCase(name)){
                return member;
            }
        }
        return null;
    }
}