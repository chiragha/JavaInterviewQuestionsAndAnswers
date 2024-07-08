
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Even_oddNum {
    int x;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        
        System.out.println("Enter number- ");
        int x = scan.nextInt();
        if(x % 2 != 0){
            System.out.println("Number Odd");
        }else{
            System.out.println("Even number");
        }
    }
    
}
