/**
 * Lucas Waldrop
 * Project
 * Programming III - AP CS
 * Date
 */

import java.util.Scanner;

public class UserValidationInput {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;
        
        System.out.print("Please enter your eight-digit verification number: ");
        userInput = keyboard.nextInt();
        
        ChargeAccountValidation employee = new ChargeAccountValidation();
        employee.Validation(userInput);
    }

}