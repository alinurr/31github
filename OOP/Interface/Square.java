package OOP.Interface;

public class Square implements Polygon{
    int length;
    Square(int length){
        this.length = length;
    }
    @Override
    public void calculateArea() {
        System.out.println(length * length);
    }
}
