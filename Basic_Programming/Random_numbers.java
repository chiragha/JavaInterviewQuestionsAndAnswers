
package com.chiragha.SelectionDemo ;

import java.util.Random;

public class Random_numbers {
    public static void main(String[] args){
        Random random = new Random();
        
        
        int x =  random.nextInt(6)+1;
        System.out.println(x);
        
        //Double----------------
        
     double y =  random.nextDouble();
        System.out.println(y);




//Boolean--------

                boolean z =  random.nextBoolean();
                System.out.println(z);
        
    }
    
}
