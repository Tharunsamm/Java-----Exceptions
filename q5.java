import java.nio.file.Files;
import java.nio.file.Path;

public class q5 {

    public static void readFile() throws Exception {

        Path path = Path.of(
            "C:\\Users\\17244\\OneDrive\\Desktop\\txt2.txt"
        );

        String data = Files.readString(path);

        if (data.isEmpty()) {
            throw new Exception("File is empty");
        }

        System.out.println(data);
    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (Exception e) {

            System.out.println("Exception caught: " + e.getMessage());

        }
    }
}