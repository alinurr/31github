package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
    HashMap<Integer,String> student = new HashMap<>();
    Scanner input = new Scanner(System.in);

    void add(){
        student.put(101, "Niall");
        student.put(102, "Anna");
    }

    void addStudent(){
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your id: ");
        int id = input.nextInt();
        student.put(id, name);
    }
}
