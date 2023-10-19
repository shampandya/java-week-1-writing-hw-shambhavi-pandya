package practiceprograme;
/**
 * 10. Write a Java program that takes two numbers as input and display the
 * product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output : 25 x 5 = 125
 */

public class Prog10_TwoNumbers {
    public static void main (String [] args){
        // first Number declaration
        int firstNumber = 25;
        //second Number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        // Expected output
        System.out.println(firstNumber + " * "+ secondNumber + " = " +produced);
    }
}
