import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork14 {

    public void homework14() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input:");
        String string = bufferedReader.readLine();
        int integer = Integer.parseInt(string);
        double doble = (double)integer;

        System.out.println("Output:");
        System.out.println(integer);
        System.out.println(string);
        System.out.println(doble);
    }
}
