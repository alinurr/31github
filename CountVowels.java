import java.util.Scanner;

public class CountVowels {
    public static int vowelsNumber(String text){

        String convertedString = text.toLowerCase();

        int counter = 0;

        for(int i = 0; i < convertedString.length(); i++){
            if(convertedString.charAt(i) == 'a' ||
                    convertedString.charAt(i) == 'e' ||
                    convertedString.charAt(i) == 'i' ||
                    convertedString.charAt(i) == 'o' ||
                    convertedString.charAt(i) == 'u'){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int count = vowelsNumber(text);
        System.out.println(count);
    }
}
