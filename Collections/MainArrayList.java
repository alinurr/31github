package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args){
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("C++");
        courses.add("Psychology");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        boolean result = courses.contains(text);
        System.out.println(result);

    }
}
