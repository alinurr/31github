package OOP.Super;

public class Mammal extends Animal{
    String type = "mammal";
    @Override
    void display(){
        System.out.println("I am a mammal");
    }

    void printMessage(){
        display();
        super.display();
        System.out.println("I am a " + super.type);
    }


}
