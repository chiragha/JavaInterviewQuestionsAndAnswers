/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chiragha.shivaniapplication;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Triangle_hypotenuse {
    public static void main(String[] args){
        double x;
        double y;
        double z;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        
        
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        
        
        z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("the hypotenuse is : "+z);
        
        scanner.close();
    }
    
}
