package Loops;

/*Используя цикл for, выведи на экран чётные числа от 1 до 100 включительно.
Каждое значение выведи с новой строки.
*/

public class Task0435 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i=i+2) {
            System.out.println(i);
        }
    }
}