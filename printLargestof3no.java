import java.util.*;
public class printLargestof3no {
    public static void main(String[] args) {
        try ( Scanner  sc= new Scanner(System.in)){
            int a =sc.nextInt();
            int b= sc.nextInt();
            int c =sc.nextInt();

        if( (a>=b) && (a>=c)) {
            System.out.println("Greatest number is A");
            
        } else if (b>c){
            System.out.println("Greatest number is B");
        }else{
            System.out.println("Greatest number is C");
        }
            
        }
    }
        
        

        
    }

