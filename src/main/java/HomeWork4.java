import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {

    public void homework4() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        byte byteNumber = Byte.parseByte(bufferedReader.readLine());
        int byteInteger = byteNumber;
        System.out.println(byteInteger);
    }
}
