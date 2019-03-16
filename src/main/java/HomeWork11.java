import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork11 {

    public void homework11() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input:");
        String string = bufferedReader.readLine();
        System.out.println("Your input:");
        System.out.println(string);
    }
}
