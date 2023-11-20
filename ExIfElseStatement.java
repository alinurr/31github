import java.util.Scanner;

public class ExIfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String sex = sc.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);

        if(sex.equals("F")){
            System.out.println("You will work in urban ares");
        }
        else if (sex.equals("M") && (age >= 20 && age <= 40)){
            System.out.println("You may work anyware");
        }
        else if (sex.equals("M") && (age >= 40 && age <= 60)){
            System.out.println("You will work in urban areas only");
        }else if(age > 60){
            System.out.println("ERROR");
        }
    }
}
