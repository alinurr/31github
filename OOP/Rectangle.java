package OOP;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    Rectangle(int x, int y){
        length = x;
        breadth = y;
    }

    public void calculateArea(){
        int area = length * breadth;
        System.out.println(area);
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        Rectangle obj = new Rectangle(x,y);
        obj.calculateArea();

        input.close();
    }
}
