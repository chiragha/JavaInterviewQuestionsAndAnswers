package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class InputMatrix {
    public static void main(String[] args) {
        int myarr[][] = new int [3][3];   //3x3 matrix
        
         System.out.println("Enter 3by3 Matrix Number");
        //user input
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                myarr[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(myarr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
