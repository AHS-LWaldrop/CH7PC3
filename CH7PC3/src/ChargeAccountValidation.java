/**
 * Lucas Waldrop
 * CH7PC3 - Charge Account Validation
 * Programming III - APCS
 * 12/18/18
 */
public class ChargeAccountValidation {
    /**
     * int[] array: holds valid numbers to be compared to the input
     * boolean valid: checks if the loop is true, and which output to give
     */
    int[] array = {5658845, 4520125, 8777541, 845177, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
    boolean valid = false;
    
    /**
     * The Validation method compares each number in "int[] array"
     * to the user's input.
     */
    public void Validation(int userInput){
        int length = array.length;
            for(int x = 0; x < length; x++){
                if(userInput == array[x]){
                    System.out.println("Your number is in the list.");
                    valid = true;
                }
            }
            if(valid == false){
                System.out.println("Your number in not in the list.");
            }
        }
    }
