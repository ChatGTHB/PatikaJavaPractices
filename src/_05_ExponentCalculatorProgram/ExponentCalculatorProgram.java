package _05_ExponentCalculatorProgram;

import java.util.Scanner;

public class ExponentCalculatorProgram {

    public static void main(String[] args) {

        int base = 0, exponent = 0;

        calculateExponent(base, exponent);

    }

    private static void calculateExponent(int base, int exponent) {

        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to be exponentiated : ");
        base = input.nextInt();

        System.out.print("Enter the number to be the exponent : ");
        exponent = input.nextInt();

        if (exponent < 0) {
            while (exponent < 0) {
                System.out.print("Please enter a non-negative number : ");
                exponent = input.nextInt();
            }
        }

        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }

        System.out.println("Total = " + total);
    }

}

