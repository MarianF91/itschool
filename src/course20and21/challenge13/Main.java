package course20and21.challenge13;

public class Main {

    public static void main(String[] args) {
        Repository<Books> booksRepository = new Repository<>();

        Books book1 = new Books("Ivanhoe", "Walter Scott");
        Books book2 = new Books("Hansel and Gretel", "The Grimm Brothers");
        Books book3 = new Books("Avengers", "Stan Lee");

        booksRepository.add(book1.getTitle(), book1);
        booksRepository.add(book2.getTitle(), book2);
        booksRepository.add(book3.getTitle(), book3);

        System.out.println(booksRepository.get("Ivanhoe"));
        System.out.println(booksRepository.get("Hansel and Gretel"));
        System.out.println(booksRepository.get("Avengers"));
    }
}
