
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        int num = 0, sum = 0, rem = 0; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = scan.nextInt();
        
        while(num > 0){
            rem = num %10;
            sum = sum + rem;
            num = num /10;
            
        }
        System.out.println(sum);
    }
}
