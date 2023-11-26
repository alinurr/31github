package OOP.Abstract;

import java.util.Scanner;

public abstract class Polygon {
    abstract void calculateArea();

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();

        Rectangle rect = new Rectangle(length, breadth);
        rect.calculateArea();

        input.close();
    }
}
