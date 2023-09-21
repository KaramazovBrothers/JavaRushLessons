package If_Else;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Task0427 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a >= 1 && a <= 999) {
            if (a % 2 == 0 && a < 10) {
                System.out.println("четное однозначное число");
            } else if (a % 2 != 0 && a < 10) {
                System.out.println("нечетное однозначное число");
            } else if (a % 2 != 0 && a >= 10 && a < 100) {
                System.out.println("нечетное двузначное число");
            } else if (a % 2 == 0 && a >= 10 && a < 100) {
                System.out.println("четное двузначное число");
            } else if (a % 2 == 0 && a >= 100 && a <= 999) {
                System.out.println("четное трехзначное число");
            } else if (a % 2 != 0 && a >= 100 && a <= 999) {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}