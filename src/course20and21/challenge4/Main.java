package course20and21.challenge4;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Jailhouse Rock", "Elvis Presley", 3);
        Song song2 = new Song("Jailhouse Rock", "Elvis Presley", 4);

        System.out.println("Hashcode for song1: " + song1.hashCode());
        System.out.println("Hashcode for song2: " + song2.hashCode());
        System.out.println("Are objects equal? " + song1.equals(song2));
    }
}
