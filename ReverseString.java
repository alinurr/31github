import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String text){
        char[] charArray = text.toCharArray();
        String reversedString = " ";

        for(int i = charArray.length; i > 0; i--){
            reversedString += Character.toString(charArray[i-1]);
        }
        return reversedString;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        String result = reverseString(text);
        System.out.println(result);

    }
}
