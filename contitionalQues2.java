//Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
import java.util.*;
public class contitionalQues2 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            double temp=sc.nextDouble();
            if (temp>100) {
                System.out.println("You are suffring from fever");
                
            }else{
                System.out.println("You are okay");
            }
        }
        
    }
}
