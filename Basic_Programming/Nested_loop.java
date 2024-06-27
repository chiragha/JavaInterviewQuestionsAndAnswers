
package com.chiragha.SelectionDemo ;

import java.util.Scanner;

public class Nested_loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows;
        int column;
        String symbol ="";
        
        System.out.println("Enter no of rows: ");
        rows = scanner.nextInt();
        
        System.out.println("Enter no of columns: ");
        column = scanner.nextInt();
        
        System.out.println("Enter your symbols: ");
        symbol = scanner.next();
        
        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=column; j++){
                System.out.print(symbol);
            }
        }
        
    }
}
