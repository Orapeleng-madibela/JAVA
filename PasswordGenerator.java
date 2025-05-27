/*
 MADIBELA OT
 202156311
 SCOA021
 JAVA Assignment(Password Generator)
 25 April 2025
 */
import java.util.*;
import java.util.Scanner;

public class PasswordGenerator{
    public static void main(String[] args){

        //Alert the user about password strength and its importance

        System.out.println("Greetings, let us assist you with generating strong password.\n 1. Your password will have mixed characters such as symbols,digit,lowercase and uppercase letters. \n 2. Enter the longer length so that your password can be more secure \n 3. Password with length of 8 or more is more secure and recommended");
        
        //Allow the user to enter the length they prefere for their password
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the password you want: "); 
        int passwordLength = input.nextInt();

        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_+=<>?";
       
        String password = ""; //String variable for random password that will be generated

        //add digit to the password using for loop
        for(int k = 0; k < passwordLength; k++){
            int randomPassword = (int)(5 * Math.random());

            switch (randomPassword) {
                case 0:
                    password += String.valueOf((int)(0 *Math.random()));
                    break;
                case 1:
                    randomPassword = (int)(lowercaseLetters.length() * Math.random());
                    password += String.valueOf(lowercaseLetters.charAt(randomPassword));
                    break;
                case 2:
                    randomPassword = (int)(uppercaseLetters.length() * Math.random());
                    password += String.valueOf(uppercaseLetters.charAt(randomPassword));
                    break;
                case 3:
                    randomPassword = (int)(digits.length() * Math.random());
                    password += String.valueOf(digits.charAt(randomPassword));
                    break;
                case 4:
                    randomPassword = (int)(symbols.length() * Math.random());
                    password += String.valueOf(symbols.charAt(randomPassword));
                default:
                    break;
            }
        }
        
        //print out password
        System.out.println("Here is your password : " + password);
        // Alert the user on the strength of the password 

        if(passwordLength < 8){
            System.out.println("Your password is WEAK please restart the process and opt for password with length of 8 or more characters ");
        }else if(passwordLength >= 8 && passwordLength < 16){
            System.out.println("Your password is MODERATE");
        }else{
            System.out.println("Your password is STRONG!!!");
        }
    }
}
