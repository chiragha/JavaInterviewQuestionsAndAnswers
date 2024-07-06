
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class product_of_two_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number- ");
        
        int a = scan.nextInt();
        
        System.out.println("Multiply by- ");
        
        int b = scan.nextInt();
        
        int result = a*b;
        
        System.out.println(result);
    }
    
}
