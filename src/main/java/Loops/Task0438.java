package Loops;

/*Используя цикл for, выведи на экран:
горизонтальную линию из 10 восьмёрок;
вертикальную линию из 10 восьмёрок (символ из горизонтальной линии не учитывается).*/

public class Task0438 {
    public static void main(String[] args) {

        String s = "8";

        for (int i = 0; i < 10; i++) {
            System.out.print(s);
            }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(s);
        }
    }
}
