package org.niit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Sum of Numbers is = "+calculator.addition(number1, number2));
        System.out.println("Difference of Numbers is = "+calculator.subtraction(number1, number2));
        System.out.println("Quotient of Numbers is = "+calculator.division(number1, number2));
        System.out.println("Product of Numbers is = "+calculator.multiplication(number1, number2));
        System.out.println("Modulo of Numbers is = "+calculator.modulo(number1, number2));
    }

}

