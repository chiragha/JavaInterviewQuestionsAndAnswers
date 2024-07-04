
package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        try {
           
        
        System.out.println("Enter a whole no to divide: ");
        int x = scanner.nextInt();
        
         System.out.println("Enter a whole no to divide by: ");
        int y = scanner.nextInt();
        
        int z = x/y;
        
        System.out.println("result " + z);
        
        
        
        }catch(ArithmeticException e){
            System.out.println("You cant divide by 0");
        }catch(InputMismatchException e){
            System.out.println("Something went wrong");
        }catch(Exception e){
            System.out.println("Enter a valid number");
        }
        finally{
            scanner.close();
        }
    }
    
}
