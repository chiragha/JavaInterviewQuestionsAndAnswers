
package com.chiragha.shivaniapplication;

public class Printf {
     public static void main(String[] args) {
        // System.out.printf("this is a format string %d", 123); //this is a format string 123
        //  System.out.printf(" %d this is a format string", 123); // 123 this is a format string
        
        
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "shivi";
        int myInt = 50;
        double myDouble = 10000;
        
        // System.out.printf("%b",myBoolean );
        // System.out.printf("%c",myChar );
         //System.out.printf("%s",myString );
       //  System.out.printf("%d",myInt );
         //System.out.printf("%f",myDouble );
         
         
         //=================width
         //System.out.printf("Hello %10s", myString); // Hello      shivi
        // System.out.printf("Hello %-10s", myString);  //Hello shivi-----
         
         
         
         //Precision------------------------
         
         //System.out.printf("you have this much money %f", myDouble); // 10000.000000
         //System.out.printf("you have this much money %.2f", myDouble);  // 10000.00
         
         
         
         //[Flags]--------------------
           // System.out.printf("you have this much money %-20f", myDouble); //you have this much money 10000.000000----------
            //System.out.printf("you have this much money %20f", myDouble);  //you have this much money         10000.000000
             // System.out.printf("you have this much money %+f", myDouble);  //you have this much money +10000.000000
               //  System.out.printf("you have this much money %020f", myDouble); // you have this much money 0000000010000.000000
         
                System.out.printf("you have this much money %,f", myDouble); //you have this much money 10,000.000000
    }
}
