package Loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Task0432 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= a; i++) {
            System.out.println(s);
        }
    }
}
