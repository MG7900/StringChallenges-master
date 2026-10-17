/***
 * Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 * It must contain at least one number,
 * It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        /* TODO: your code goes here */
        boolean password_valid = false;
        boolean contain_number = false;
        boolean contain_uppercase = false;
        for(int x = 0; x < password.length(); x++){
                if (Character.isDigit(password.charAt(x))) {
                    //found isDigit online, w3schools
                    //https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
                    contain_number = true;
                    break;
                }
        }

        for(int x = 0; x < password.length(); x++){
            if (Character.isUpperCase(password.charAt(x))) {
                //found isDigit online, w3schools
                //https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
                contain_uppercase = true;
                break;
            }
        }

        String new_password = password.toLowerCase();
        boolean no_password = new_password.matches("password");

        if(contain_number && contain_uppercase){
            if(no_password){
                password_valid = false;
            } else {
                password_valid = true;
            }
        }
        return password_valid; // this is a temporary return to avoid errors
    }

}
