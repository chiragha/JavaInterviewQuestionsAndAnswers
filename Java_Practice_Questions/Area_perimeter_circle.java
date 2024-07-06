
package com.mycompany.java_practice_questions;

import java.util.Scanner;

public class Area_perimeter_circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input the radius of a circle- ");
        
        double r = scan.nextDouble();
        
        System.out.println("Perimeter - " +(2*r*Math.PI));
        System.out.println("Area - " +(Math.PI*r*r));
    }
}
