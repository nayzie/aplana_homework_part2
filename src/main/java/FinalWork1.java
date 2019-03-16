import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalWork1 {

    public void finalwork1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = bufferedReader.readLine().toCharArray();

        int result = 0;
        int iterator = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            result += Character.getNumericValue(chars[i]) * Math.pow(2, iterator);
            iterator++;
        }
        System.out.println(result);
    }
}
