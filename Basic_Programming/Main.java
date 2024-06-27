
package com.chiragha.SelectionDemo ;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?" );
        String name = scanner.nextLine();
        
         System.out.println("how old are you?" );
         int age = scanner.nextInt();
         scanner.nextLine();
         
         System.out.println("what is your food?" );
         String food = scanner.nextLine();
        
        System.out.println("hello " + name);
        System.out.println("your age " + age);
        System.out.println("your favourite food " + food);
        
        
    }
}
