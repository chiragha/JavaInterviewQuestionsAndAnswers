
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Print_Table {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number- ");
        
        int a = scan.nextInt();
        
        for(int i=0; i<10; i++){
             System.out.println(a +"*"+ (i+1)+("=")+(a*(i+1))); // 8*(0+1) = (8*(0+1)=8*1=8
             //8*(1+1) = (8*(1+1))=8*2 = 16
        }
        
       
    }
}
