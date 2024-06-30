
package com.mycompany.oop.Variables_scope;

import java.util.Random;

public class Diceroller {
           Random random;
           int number;
    public Diceroller() {
        random = new Random();
        
        roll();
    }
    
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
