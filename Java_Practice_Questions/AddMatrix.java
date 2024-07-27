
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        int first[][] = new  int[3][3];
        int last[][] = new  int[3][3];
        int sum[][] = new  int[3][3];
        
        
        //User input
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 by 3 Matrix first Values");
          for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                   first[i][j] = scan.nextInt();
              }
              
          }
          
          //display first matrix
          
          for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                   System.out.print(first[i][j]+"  ");
              }
              System.out.println();
          }    
          
          
          
          
         System.out.println("Enter 3 by 3 Matrix second Values");
          for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                   last[i][j] = scan.nextInt();
              }
              
          }
          
          
          //display second matrix
          for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                   System.out.print(last[i][j]+"  ");
              }
              System.out.println();
          }    
          //Addition
          for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                   sum[i][j] = first[i][j]+last[i][j];
                   
              }
              
          }
          
          System.out.println("Sum of two matrix: ");
          
          //display
          
          for(int i=0; i<3; i++){
              for(int j=0; j<3; j++){
                   System.out.print(sum[i][j]+"  ");
              }
              System.out.println();
          }    
        
    }
}
