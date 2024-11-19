import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        greeting();
        createUsername();
    }

    // Tarvittavat tiedot.
    static Scanner in = new Scanner(System.in);
    static String name;
    static String colour;
    static String animal;

    public static void greeting() {
        System.out.println("Who are you?");
        name = in.nextLine();
        System.out.println("Hello " + name + "!");

    }

    public static void createUsername() {
        System.out.println("Let's create a username for you. Tell me your favourite colour.");
        String colour = in.nextLine();
        System.out.println("Now tell me your favourite animal.");
        String animal = in.nextLine();
        String username = (name + "The" + colour + animal).toLowerCase();
        System.out.println("Your username is " + username + "!");
    }

}
