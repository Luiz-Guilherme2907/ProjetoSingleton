import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void write(String text) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String callerClassName = stackTrace[2].getClassName();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String data = LocalDateTime.now().format(dt);
        String linha = data + ": (" + callerClassName + ") " + text;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("debug.log", true));
            writer.write(linha);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro no arquivo de log: " + e.getMessage());
        }
    }
}