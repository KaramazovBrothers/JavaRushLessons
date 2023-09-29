package Loops;

import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

/**Используя цикл, выведи на экран сто раз надпись:
«Я никогда не буду работать за копейки. Амиго»
Каждое значение выведи с новой строки.*/

public class Task0440 {
    public static void main(String[] args) {
        String s = "Я никогда не буду работать за копейки. Амиго";

        for (int i = 0; i <= 100; i++) {
            System.out.println(s);
        }
    }
}
