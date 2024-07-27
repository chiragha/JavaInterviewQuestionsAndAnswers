
package com.mycompany.java_practice_questions;

public class MatrixMultiply {
    public static void main(String[] args) {
        
        int first [][] = {{3,4,6},   // 3x3 (3-r, 3-c)
                          {4,1,2},
                          {4,2,3}};
        
        int second [][] = {{2,3},    //3x2 (3-r, 2-c)
                          {4,2},
                          {1,1}};
        
        int multiply [][] =new int [3][2];
        
        
        //multiply code
        
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<3; k++){ // using for ith first row and jth 1st column
                    multiply[i][j]=multiply[i][j] + first[i][k]*second[k][j];
                    
                }
            }
        }
        
        //display
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(multiply[i][j]+"  ");
            }
            System.out.println();
            }
        
    }
    
}
