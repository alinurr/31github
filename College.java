import java.util.Scanner;

public class College {
    static String name;

    static void display(){
        System.out.println(name);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inputName = input.nextLine();

        College.name = inputName;

        College.display();

        input.close();
    }
}
