package Loops;

/*Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Task0439 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(s + " любит меня.");
        }
    }
}
