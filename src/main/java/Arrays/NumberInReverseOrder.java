package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberInReverseOrder {
    public static void main(String[] args) throws Exception {
        int[] s = new int[10];
        int[] d = new int[10];
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 10; i++) {
            s[i] = Integer.valueOf(bufferedReader.readLine());
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
