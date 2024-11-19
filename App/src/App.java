import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        greeting();
        createUsername();
        checkUsernameLength();
    }

    // Tarvittavat tiedot.
    static Scanner in = new Scanner(System.in);
    static String name;
    static String colour;
    static String animal;
    static String username;

    public static void greeting() {
        System.out.println("Who are you?");
        name = in.nextLine();
        System.out.println("Hello " + name + "!");

    }

    public static void createUsername() {
        System.out.println("Let's create a username for you. Tell me your favourite colour.");
        colour = in.nextLine();
        System.out.println("Now tell me your favourite animal.");
        animal = in.nextLine();
        username = (name + "The" + colour + animal).toLowerCase();
        System.out.println("Your username is " + username + "!");
    }

    public static void checkUsernameLength() {
        System.out.println("Let's check how many characters are in your username.");
        int length = username.length();
        System.out.println("Your username \"" + username + "\" has " + length + " characters!");
    }
}
