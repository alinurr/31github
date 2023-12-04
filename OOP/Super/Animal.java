package OOP.Super;

public class Animal {
    String type = "animal";

    void display(){
        System.out.println("I am an animal");
    }


    public static void main(String[] args){
        Mammal mammal = new Mammal();
        mammal.printMessage();
    }
}
