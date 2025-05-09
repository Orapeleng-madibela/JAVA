import java.util.*;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        /*
        Ask the student to enter their percentage out of 100 and print the corresponding symbol  
         Mark greater than 79% - A 
        • Mark between 70% and 79% - B 
        • Mark between 60% and 69% - C 
        • Mark between 50% and 59% - D 
        • Mark between 40% and 49% - E 
        • Mark less than 40% - F
         */
        
         //prompt the user to enter their percentage
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your percentage(0-100) : " );
         int percentage = input.nextInt();

         //Decision
         if (percentage > 79 ) {
            System.out.println("A");
         }else if(percentage >= 70){
            System.out.println("B");
         }else if(percentage >=60){
            System.out.println("C");
         }else if(percentage >= 50){
            System.out.println("D");
         }else if(percentage >= 40){
            System.out.println("E");
         }else{
            System.out.println("F");
         }

         //check if the percentage is odd or even number
         if (percentage % 2 == 0){
            System.out.println("Percentage number is even");
         }else{
            System.out.println("The percentage number is odd");
         }

    }
}
