import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork7 {

    public void homework7() throws IOException {

        int x = 5;
        int y = 3;
        int z = 2;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите T: ");
        int t = Integer.parseInt(bufferedReader.readLine());

        if (t == x || t == y || t == z) System.out.println("Данное значение имеется в константах");
            else System.out.println("Такой константы нет!");
    }
}
