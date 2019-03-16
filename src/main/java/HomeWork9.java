import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork9 {

    public void homework9() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + "-е число массива");
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println("Вывод элементов массива х2");
        for (int i : array) {
            System.out.println(i * 2);
        }


    }
}
