package Loops;

import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Введи с клавиатуры два числа - m и n.
Используя цикл for, выведи на экран прямоугольник размером m на n из восьмёрок
 */

public class Task0436 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        String s = "8";

        for (int i = 1; i <= a; i++) {
            for (int f = 1; f <= b; f++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
