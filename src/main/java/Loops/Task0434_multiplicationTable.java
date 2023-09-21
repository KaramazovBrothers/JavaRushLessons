package Loops;

import com.codeborne.selenide.commands.SelectOptionByTextOrIndex;

public class Task0434_multiplicationTable {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(i * a + " ");
            }
            System.out.println();
        }
    }
}
