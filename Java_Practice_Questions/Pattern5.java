package com.mycompany.java_practice_questions;
import java.util.Scanner;
public class Pattern5 {
     public static void main(String[] args) {
        //5 line
//        1        1
//        22      22
//        333    333
//        4444  4444  
//        5555555555   

     int lines =0;
     int spaces = 0;
     int val =1;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        
        lines = sc.nextInt();
        spaces = (lines*2)-2;
        
        for(int i=1;i<=lines;i++){
            for(int l=1; l<=i; l++){
                System.out.print(val);
            }
            for(int s=1; s<=spaces;s++ ){
                System.out.print(" ");
            }
            for(int r=1;r<=i;r++){
                System.out.print(val);
            }
           spaces = spaces-2;
           val = val+1;
           System.out.println();
        }



    }
    
}
