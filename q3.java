import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class q3 {

    public static void readFile() throws IOException {

       Path path = Path.of("C:\\Users\\17244\\OneDrive\\Desktop\\txt2.txt");
        String data = Files.readString(path);

        System.out.println(data);
    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (IOException e) {

            System.out.println("Exception caught: File does not exist: " + e.getMessage());

        }
    }
}