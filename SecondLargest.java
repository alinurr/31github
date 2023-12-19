import java.util.Scanner;

public class SecondLargest {
    
    public static int secondLargestElement(int[] numbers){
        int largest, secondLargest;
        
        if(numbers[0] > numbers[1]){
            largest = numbers[0];
            secondLargest = numbers[1];
        }else {
            largest = numbers[1];
            secondLargest = numbers[0];
        }
        
        for (int i = 2; i < numbers.length; i++){
            if (numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int result = secondLargestElement(numbers);
        System.out.println(result);
    }
}
