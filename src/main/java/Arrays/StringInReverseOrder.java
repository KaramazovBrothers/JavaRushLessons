package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StringInReverseOrder {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        String[] d = new String[10];
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 8; i++) {
            s[i] = bufferedReader.readLine();
        }

        //копируем элементы из одного массива в другой в обратном порядке
        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            d[j] = s[i];
        }

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
