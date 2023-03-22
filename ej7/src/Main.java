import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void WriteFile(InputStream FileIn, PrintStream FileOut) throws IOException {
        byte []data = FileIn.readAllBytes();
        FileOut.write(data);
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        try {
            InputStream input = new FileInputStream("ej6/src/input.txt");
            PrintStream info = new PrintStream("ej6/src/copia.txt");
            WriteFile(input, info);
        } catch (IOException e) {
            System.out.println("Not found: " + e.getMessage());
        }
    }
}