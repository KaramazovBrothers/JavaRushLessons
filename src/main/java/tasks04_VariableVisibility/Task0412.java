package tasks04_VariableVisibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task0412 {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int input = Integer.parseInt(bufferedReader.readLine());

        if(input>0){
            System.out.println(input*2);
        } else if (input == 0){
            System.out.println(input);
        } else {
            System.out.println(input+1);
        }
    }
}
