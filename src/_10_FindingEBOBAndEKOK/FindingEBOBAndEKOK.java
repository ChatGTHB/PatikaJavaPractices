package _10_FindingEBOBAndEKOK;

import java.util.Scanner;

public class FindingEBOBAndEKOK {

    public static void main(String[] args) {

        int number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        number2 = input.nextInt();

        findEBOBAndEKOK(number1, number2);
    }

    private static void findEBOBAndEKOK(int number1, int number2) {

        int smallNumber = 0, bigNumber = 0;

        if (number1 < number2) {
            smallNumber = number1;
            bigNumber = number2;
        } else if (number1 > number2) {
            smallNumber = number2;
            bigNumber = number1;
        } else {
            smallNumber = bigNumber;
        }

        int number = 1, ebob = 1;
        while (number <= smallNumber) {
            if (smallNumber % number == 0 && bigNumber % number == 0) {
                ebob = number;
            }
            number++;
        }
        System.out.println("EBOB [" + number1 + "," + number2 + "] = " + ebob);
        System.out.println("EKOK [" + number1 + "," + number2 + "] = " + (number1 * number2) / ebob);
    }
}


