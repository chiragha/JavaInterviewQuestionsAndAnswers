
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class AverageOfnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input first number- ");
        
        int num1 = scan.nextInt();
        
         System.out.println("Input Second number- ");
        
        int num2 = scan.nextInt();
        
         System.out.println("Input Third number- ");
        
        int num3 = scan.nextInt();
        
        System.out.println("Average of numbers - "+ (num1 + num2 + num3)/3);
    }
}
