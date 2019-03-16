import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork12 {

    public void homework12() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input:");
        String string = bufferedReader.readLine().replaceAll("//s+", "");
        System.out.println("Your input without spaces:");
        System.out.println(string);
    }
}
