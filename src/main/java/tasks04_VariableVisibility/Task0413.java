package tasks04_VariableVisibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0413 {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int input = Integer.parseInt(bufferedReader.readLine());

        String[] daysOfWeek = {
                "понедельник", "вторник", "среда", "четверг",
                "пятница", "суббота", "воскресенье"
        };

        if (input >= 1 && input <= 7) {
            System.out.println(daysOfWeek[input - 1]);
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}
        //Another option
        //       if (input == 1) {
        //            System.out.println("понедельник");
        //        } else if (input == 2) {
        //            System.out.println("вторник");
        //       } else if (input == 3) {
        //            System.out.println("среда");
        //        } else if (input == 4) {
        //            System.out.println("четверг");
        //       } else if (input == 5) {
        //            System.out.println("пятница");
        //        } else if (input == 6) {
        //            System.out.println("суббота");
        //       } else if (input == 7) {
        //            System.out.println("воскресенье");
        //        } else {
        //           System.out.println("такого дня недели не существует");
        //       }

