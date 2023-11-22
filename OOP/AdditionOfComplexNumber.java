package OOP;

import java.util.Scanner;

public class AdditionOfComplexNumber {

    double real;
    double imag;

    AdditionOfComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();

        AdditionOfComplexNumber c1 = new AdditionOfComplexNumber(n1, n2);
        AdditionOfComplexNumber c2 = new AdditionOfComplexNumber(n3, n4);

        double realSum = c1.real + c2.real;
        double imagSum = c1.imag + c2.imag;

        System.out.println(realSum + " + " + imagSum + "i");
    }
}
