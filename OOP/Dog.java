package OOP;

public class Dog {
    String name;
    String breed;

    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }

    String getBreed(){
        return this.breed;
    }

    void setBreed(String breed){
        this.breed = breed;
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("Aktos", "Alabay");
        Dog dog2 = new Dog("Aksuyek", "Taz");

        System.out.println(dog1.getName());
        System.out.println(dog2.getBreed());

        dog1.setName("Aksuyek");
        System.out.println("The name of the dog1 is " + dog1.getName() + " now");

        dog2.setBreed("Alabay");
        System.out.println("The breed of dog2 is " + dog2.getBreed() + " now");
    }
}
