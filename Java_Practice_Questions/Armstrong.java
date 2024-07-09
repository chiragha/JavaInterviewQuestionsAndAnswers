
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, original, result,num1, num2,num3;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = scan.nextInt();
        original = num;
        
        num1 = num%10;
        num = num/10;
        
        num2= num%10;
        num = num/10;
        
        num3= num%10;
        num = num/10;
        
        
        result = num1*num1*num1 + num2*num2*num2 + num3*num3*num3;
                if(original == result){
                    System.out.println(original+" is a armstrong number");
                }else{
                    System.out.println(original+" is not a armstrong number");
                }
                
    }
}
