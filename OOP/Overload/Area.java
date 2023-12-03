package OOP.Overload;

public class Area {
    void computeArea(double length, double breadth){
        System.out.println(length * breadth);
    }

    void computeArea(double length){
        System.out.println(length * length);
    }

    public static void main(String[] args){
        Area a1 = new Area();
        a1.computeArea(2.2, 2.2);
        a1.computeArea(3);
    }
}
