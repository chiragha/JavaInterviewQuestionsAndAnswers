
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int num = scan.nextInt();
        
        boolean flag = true;
        
        if(num == 0 || num == 1){
            System.out.println("Value is not a prime Number");
        }else{
            for(int i=2; i<num/2; i++){
                if(num%i == 0){
                    System.out.println("Number is not a prime");
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println("Value is prime number");
            }
        }
                
    }
}
