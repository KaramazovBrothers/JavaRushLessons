package If_Else;

import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0418 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(reader.readLine());
        int input2 = Integer.parseInt(reader.readLine());

        if (input1>input2) {
            System.out.println(input2);
        } else if (input2>input1) {
            System.out.println(input1);
        } else {
            System.out.println(input1);
        }
    }
}
