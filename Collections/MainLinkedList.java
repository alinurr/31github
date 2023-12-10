package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class MainLinkedList {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();


        names.add(name1);
        names.add(name2);


        names.add(0, name3);
        names.remove(2);


        System.out.println(names);
    }

}
