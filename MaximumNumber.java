/*
Sobejan Srikanthan © 2022 | All Rights Reserved
A program that asks the user to enter 4 integer numbers and then print the biggest number.
*/

import java.util.Scanner;
class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number1 = input.nextInt();
        System.out.print("Enter an integer: ");
        long number2 = input.nextInt();
        System.out.print("Enter an integer: ");
        long number3 = input.nextInt();
        System.out.print("Enter an integer: ");
        long number4 = input.nextInt();
        input.close();

        long bignumber1 = maxTwo(number1, number2);
        long bignumber2 = maxTwo(number3, number4);
        long biggestnumber = maxTwo(bignumber1, bignumber2);

        System.out.println(" ");
        System.out.println("Biggest number: " + biggestnumber);
    }

    public static int maxTwo (long firstNumber, long secondNumber) {
        // find the biggest number from the first and second number
        if (firstNumber > secondNumber){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}