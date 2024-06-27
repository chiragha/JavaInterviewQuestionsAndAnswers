
package com.chiragha.SelectionDemo ;

public class Switch {
    public static void main(String[] args){
        
       // String day = "Monday";
        String day = "Burger";
        
        switch(day){
             case "Sunday":
                    System.out.println("It is Sunday");
                    break;
             case "Monday":
                    System.out.println("It is Monday");
                    break;
             case "Tuesday":
                    System.out.println("It is Tuesday");
                    break;
             case "Wednesday":
                    System.out.println("It is Wednesday");
                    break;  
             case "Thurdsday":
                    System.out.println("It is Thurdsday");
                    break;
             case "Friday":
                    System.out.println("It is Friday");
                    break;
             case "Saturday":
                    System.out.println("It is Saturday");
                    break;  
             default:
                   System.out.println("It is not a day");
        }
               
    }
    
}
