
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        // without recursion-----------------
        //------------------------
        
        
//        int fact = 1;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number-: ");
//        int x = scan.nextInt();
//        for(int i=1; i<=x; i++){
//           fact = fact * i;
//        }
//        System.out.println("Factorial of " +x+ " is "+fact);


         //    Recursion method-----------------------
         //----------------------------------------------
         
         
         int answer = 1;
         
      
         Scanner scan = new Scanner(System.in);
          System.out.println("Enter number-: ");
           int x = scan.nextInt();
           
           answer = fact(x);
           
           System.out.println(answer);
           
             }
    
          static int fact(int a){
              if(a<=1){
                  return 1;
              }else{
                  return a* fact(a-1);
              }
          }
}
