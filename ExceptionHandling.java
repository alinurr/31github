import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        try {
            int[] numbers = {1, 5, 12};
            int index = input.nextInt();
            System.out.println(numbers[index]);
        }catch (Exception e){
            System.out.println("Index is wrong");
        }


    }
}
