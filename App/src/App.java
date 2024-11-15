import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        greeting();
    }

    public static void greeting() {
        Scanner in = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
