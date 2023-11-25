package OOP.Inheritance;

import java.util.Scanner;

public class Fruit {
    void displayGeneralInfo(){
        System.out.println("I am a fruit");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Mandarin mandarin = new Mandarin();
        mandarin.displayName(name);
        mandarin.displayGeneralInfo();
        mandarin.makeJuice();
    }

}
