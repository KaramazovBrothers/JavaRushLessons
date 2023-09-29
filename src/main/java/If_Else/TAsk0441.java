package If_Else;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import static io.opentelemetry.sdk.trace.IdGenerator.random;

/**
 * Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, выведи любое из них.
 * Если два числа из трех равны, вывести любое из двух.
 */

public class TAsk0441 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ( (a > b && a < c) || (a<b && a > c))  {
            System.out.println(a);
        } else if ( (b > a && b < c) || (b < a && b > c) ) {
            System.out.println(b);
        } else if ( (c > b && c < a) || (c < b && c > a)) {
            System.out.println(c);
        } else if ( a == b || a == c){
            System.out.println(a);
        } else if (b == c){
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
