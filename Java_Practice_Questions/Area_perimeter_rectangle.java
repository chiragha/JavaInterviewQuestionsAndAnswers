
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Area_perimeter_rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the width of rectangle- ");
        
        double width = scan.nextDouble();
        
        System.out.println("Input the height of rectangle- ");
        
        double height = scan.nextDouble();
        
        double perimeter = 2*(width+height);
        
        double area = height * width;
        
        System.out.println("Perimeter- " + perimeter +"\n"+ "Area- " + area );
    }
}
