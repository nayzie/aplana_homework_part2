import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork16 {

    public void homework16() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(
                System.getProperty("user.dir") +
                        "/src/main/resources/exampleRead.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        }
    }
}
