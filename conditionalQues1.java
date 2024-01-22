//Write a Java program to get a number from the user and print whether it is   positive or negative
import java.util.*;
public class conditionalQues1 {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner (System.in)){
            int number = sc.nextInt();
            if (number<0) {
                System.out.println("Your number is negative ");
                
            }else{
                System.out.println("your number is positive");
            }
        }
    }
    
}
