import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {

    public void homework5() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(number + " x 0 = " + number * 0);
        System.out.println(number + " x 1 = " + number * 1);
        System.out.println(number + " x 2 = " + number * 2);
        System.out.println(number + " x 3 = " + number * 3);
        System.out.println(number + " x 4 = " + number * 4);
        System.out.println(number + " x 5 = " + number * 5);
        System.out.println(number + " x 6 = " + number * 6);
        System.out.println(number + " x 7 = " + number * 7);
        System.out.println(number + " x 8 = " + number * 8);
        System.out.println(number + " x 9 = " + number * 9);
    }
}
