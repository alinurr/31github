package OOP.Abstract;

public class Rectangle extends Polygon{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void calculateArea() {
        System.out.println(length * breadth);
    }
}
