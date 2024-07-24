
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        
        
        System.out.println("Enter number of rows: ");
        Scanner scan = new Scanner(System.in);
        
        int rows = scan.nextInt();
        
        int value =0;
        for(int i=0; i< rows; i++){   // for rows
            for(int s=0; s<(rows-i-1); s++){  // for space
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){  //for values
             value = Binomial(i, j);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
    //recursive function
    static int Binomial(int line, int col){
        if(col == 0 | line == col){
            return 1;
        }else{
           return (Binomial(line-1, col-1) + Binomial(line-1, col));
        }
    }
}
