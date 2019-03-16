import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork10 {

    public void homework10() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Введите элемент массива с индексом [" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }
        System.out.println("Вывод первой строки матрицы, умноженный на 3: ");
        for (int i = 0; i < array[1].length; i++) System.out.println(array[1][i] * 3);
    }
}
