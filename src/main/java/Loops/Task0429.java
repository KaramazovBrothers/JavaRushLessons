package Loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0429 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int f = 0;
        int g = 0;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0) {
                f++;
            } else if (a < 0) {
                g++;
            }
        }
        System.out.println("количество отрицательных чисел: " + g + "\n" + "количество положительных чисел: " + f);
    }
}