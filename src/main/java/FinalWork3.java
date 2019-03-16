import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalWork3 {

    public void finalwork3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите текущий курс: ");
        double ruCost = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Введите сумму, которую хотите перевести: ");
        double ruCount = Double.parseDouble(bufferedReader.readLine());

        double result = ruCount/ruCost;

        System.out.println("Результат конвертации: " + result);
    }
}
