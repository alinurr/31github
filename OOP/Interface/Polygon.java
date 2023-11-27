package OOP.Interface;

import java.util.Scanner;

public interface Polygon {
    void calculateArea();

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        Square square = new Square(length);
        square.calculateArea();

        input.close();
    }
}
