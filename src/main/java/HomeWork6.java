import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork6 {

    public void homework6() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Х: ");
        double x = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите Х: ");
        double y = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Введите Х: ");
        double z = Double.parseDouble(bufferedReader.readLine());

        double sredneeArif = (x + y + z) / 3;
        int sredneeArifPoplam = (int)(sredneeArif / 2);

        System.out.println("Среднее арифметическое: " + sredneeArif);

        if (sredneeArif > 3) {
            System.out.println("Программа выполнена корректно.");
        }

    }
}
