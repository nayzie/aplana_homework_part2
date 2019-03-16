import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork17 {

    public void homework17() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder resultLine = new StringBuilder();

        System.out.println("Введите строку для записи в файл. Ввод строк прекратиться если ввести слово 'Стоп'.");
        while (true) {
            String inputLine = bufferedReader.readLine();
            if (inputLine.equals("Стоп")) break;
            resultLine.append(inputLine).append("\n");
        }

        try (final FileWriter writer = new FileWriter(
                System.getProperty("user.dir") +
                        "/src/main/resources/exampleWrite.txt", false)) {
            writer.write(String.valueOf(resultLine));
        }
    }
}
