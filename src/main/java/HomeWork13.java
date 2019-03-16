import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork13 {

    public void homework13() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("First Input:");
        String firstString = bufferedReader.readLine();

        System.out.println("Second Input:");
        String secondString = bufferedReader.readLine();

        if (firstString.length() > secondString.length()) System.out.println("The longest string: \n" + firstString);
            else if(secondString.length() > firstString.length()) System.out.println("The longest string: \n" + secondString);
            else System.out.println("Strings have same length");
    }
}
