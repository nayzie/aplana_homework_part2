import java.io.*;

public class HomeWork18 {

    public void homework18() throws IOException {
        int linecount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(
                System.getProperty("user.dir") +
                        "/src/main/resources/exampleReadWrite.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                linecount++;
            }
            String everything = sb.toString();
            System.out.println(everything);
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder resultLine = new StringBuilder();

        while (linecount != 0) {
            String inputLine = bufferedReader.readLine();
            resultLine.append(inputLine).append("\n");
            linecount--;
        }

        try (final FileWriter writer = new FileWriter(
                System.getProperty("user.dir") +
                        "/src/main/resources/exampleReadWrite.txt", false)) {
            writer.write(String.valueOf(resultLine));
        }
    }
}
