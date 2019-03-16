import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalWork2 {

    public void finalwork2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[4];
        System.out.println("Введите массив из 4: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        array = sortArray(array);

        System.out.println("Итог: ");
        for (int number: array) System.out.print(number + " ");
    }

    public int[] sortArray(int[] mas) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        return mas;
    }
}
