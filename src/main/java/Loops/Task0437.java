package Loops;

/*Используя цикл for, выведи на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.*/

public class Task0437 {
    public static void main(String[] args) {

        String s = "8";
        int f = 0;

        for (int i = 0; i < 10; i++) {
            f++;
            for (int j = 0; j < f; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}

