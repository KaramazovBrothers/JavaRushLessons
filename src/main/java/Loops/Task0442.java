package Loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Давай напишем программу, в которой нужно будет вводить числа с клавиатуры, и как только будет введено -1,
 * вывести на экран сумму всех чисел и завершить программу.
 * -1 должно учитываться в сумме.
 */

public class Task0442 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            int i = Integer.parseInt(bufferedReader.readLine());
            sum += i;
            if (i == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
