package If_Else;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0419 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int i = Integer.parseInt(reader.readLine());

        if (i < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
