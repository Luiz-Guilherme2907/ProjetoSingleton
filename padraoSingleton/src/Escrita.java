import java.util.Scanner;

public class Escrita {
    private static Escrita instance;
    private Scanner scanner;

    private Escrita() {
        scanner = new Scanner(System.in);
    }

    public static Escrita getInstance() {
        if (instance == null) {
            instance = new Escrita();
        }
        return instance;
    }

    public void write(String text, boolean nextLine) {
        if (nextLine) {
            System.out.println(text);
        } else {
            System.out.print(text);
        }
    }

    public String read(String text) {
        write(text + " ", false);
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
