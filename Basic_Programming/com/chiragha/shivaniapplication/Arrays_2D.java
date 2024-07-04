
package com.chiragha.shivaniapplication;


public class Arrays_2D {
     public static void main(String[] args){
         
         
           String[][] thing = {
               {"pen","pencil","box"},
               {"sketch","crayons","pencil-color"},
               {"toys","copy","book"}
                               };
           
           
       //  String[][] thing = new String[3][3];
         
         
//         thing[0][0] = "pen";
//         thing[0][1] = "pencil";
//         thing[0][2] = "box";
//         thing[1][0] = "sketch";
//         thing[1][1] = "crayons";
//         thing[1][2] = "pencil-color";
//         thing[2][0] = "toys";
//         thing[2][1] = "copy";
//         thing[2][2] = "book";
         
         
         for(int i=0; i<thing.length; i++){
              System.out.println();
              for(int j=0; j<thing[i].length; j++){
                   System.out.print(thing[i][j]+" ");
              }
         }
         
         
     }
}
