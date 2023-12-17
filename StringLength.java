import java.util.Scanner;

public class StringLength {
    public static int lengthOfString(String text){

        char[] textArray = text.toCharArray();

        int counter = 0;

        for(char ch : textArray){
            counter++;
        }
        return counter;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int count = lengthOfString(text);
        System.out.println(count);
    }
}
